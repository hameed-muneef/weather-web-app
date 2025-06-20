# Use a lightweight Java 17 image as the base
FROM openjdk:17-jdk-slim

# Set the working directory inside the container
WORKDIR /app

# Copy the Maven project files
COPY pom.xml .
COPY src ./src

# Build the Spring Boot application
# Use --no-transfer-progress to reduce log verbosity
RUN apt-get update && apt-get install -y maven && \
    mvn clean package -DskipTests --no-transfer-progress

# Expose the port that the Spring Boot application runs on
EXPOSE 8080

# Define the entry point to run the JAR file
ENTRYPOINT ["java", "-jar", "target/weather-web-app-1.0.0.jar"]


