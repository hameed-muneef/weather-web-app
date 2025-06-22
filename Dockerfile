# Use a lightweight Java 17 image as the base
FROM openjdk:17-jdk-slim

COPY target/weather-web-app-1.0.0.jar app.jar

EXPOSE 8080

# Define the entry point to run the JAR file
ENTRYPOINT ["java", "-jar", "/app.jar"]


