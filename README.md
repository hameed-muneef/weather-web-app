# Weather Web Application

A modern Spring Boot web application that provides current weather information using the Open-Meteo API. The application features a responsive web interface built with Bootstrap and Thymeleaf templating.

## Features

- **Modern Web Interface**: Responsive design with Bootstrap 5 and custom CSS
- **Real-time Weather Data**: Integration with Open-Meteo API (no API key required)
- **Comprehensive Weather Information**: 
  - Current temperature and "feels like" temperature
  - Weather condition with emoji icons
  - Humidity, wind speed and direction
  - Atmospheric pressure and cloud cover
  - Location details and elevation
- **Global Coverage**: Support for any location worldwide using latitude/longitude coordinates
- **Error Handling**: User-friendly error messages and input validation
- **Responsive Design**: Works on desktop and mobile devices

## Technologies Used

- **Backend**: Spring Boot 3.2.0, Spring WebFlux
- **Frontend**: Thymeleaf, Bootstrap 5, Font Awesome icons
- **API Integration**: WebClient for reactive HTTP calls
- **Build Tool**: Maven
- **Java Version**: 17

## Project Structure

```
src/
├── main/
│   ├── java/
│   │   └── com/weather/webapp/
│   │       ├── WeatherWebApplication.java    # Main Spring Boot application
│   │       ├── controller/
│   │       │   └── WeatherController.java    # Web controller for handling requests
│   │       ├── service/
│   │       │   └── WeatherService.java       # Weather API service
│   │       ├── model/                        # Data models for API response
│   │       │   ├── WeatherResponse.java
│   │       │   ├── Current.java
│   │       │   └── CurrentUnits.java
│   │       └── config/
│   │           └── WebConfig.java            # Web configuration
│   └── resources/
│       ├── templates/
│       │   └── index.html                    # Main web page template
│       ├── static/
│       │   └── style.css                     # Additional CSS styles
│       └── application.properties            # Spring Boot configuration
└── pom.xml                                   # Maven dependencies and build configuration
```

## Prerequisites

- Java 17 or higher
- Maven 3.6 or higher

## Installation and Setup

1. **Clone or extract the project**
   ```bash
   cd weather-web-app
   ```

2. **Build the project**
   ```bash
   mvn clean compile
   ```

3. **Run the application**
   ```bash
   mvn spring-boot:run
   ```

4. **Access the application**
   Open your web browser and navigate to: `http://localhost:8080`

## Usage

1. **Enter Coordinates**: Input latitude and longitude values in the form fields
2. **Get Weather**: Click the "Get Weather" button to fetch current weather data
3. **View Results**: The application displays comprehensive weather information including:
   - Temperature and weather condition
   - Humidity and atmospheric pressure
   - Wind speed, direction, and gusts
   - Cloud cover percentage
   - Location details and elevation

## Example Coordinates

- **New York City**: 40.7128, -74.0060
- **London**: 51.5074, -0.1278
- **Tokyo**: 35.6762, 139.6503
- **Sydney**: -33.8688, 151.2093
- **Paris**: 48.8566, 2.3522

## API Information

This application uses the free **Open-Meteo API** (https://open-meteo.com/) which provides:
- No API key required
- High-resolution weather data from national weather services
- Global coverage with 11km resolution
- Real-time current weather conditions
- Historical and forecast data

## Configuration

The application can be configured through `src/main/resources/application.properties`:

```properties
# Server configuration
server.port=8080

# Application name
spring.application.name=Weather Web Application

# Thymeleaf configuration
spring.thymeleaf.cache=false

# Logging levels
logging.level.com.weather.webapp=DEBUG
```

## Development Features

- **Spring Boot DevTools**: Automatic restart during development
- **Thymeleaf**: Server-side templating with hot reload
- **WebFlux**: Reactive programming for API calls
- **Bootstrap**: Responsive UI framework
- **Font Awesome**: Icon library for enhanced UI

## Error Handling

The application includes comprehensive error handling:
- Input validation for coordinate ranges
- Network error handling for API calls
- User-friendly error messages
- Graceful fallback for failed requests

## Responsive Design

The application is fully responsive and includes:
- Mobile-friendly interface
- Touch-optimized controls
- Adaptive layouts for different screen sizes
- Modern gradient backgrounds and animations

## Testing

To run tests:
```bash
mvn test
```

## Building for Production

To create a production-ready JAR file:
```bash
mvn clean package
```

The JAR file will be created in the `target/` directory and can be run with:
```bash
java -jar target/weather-web-app-1.0.0.jar
```

## Troubleshooting

**Common Issues:**

1. **Port 8080 already in use**: Change the port in `application.properties`
2. **Network connectivity issues**: Check internet connection for API access
3. **Invalid coordinates**: Ensure latitude is between -90 and 90, longitude between -180 and 180
4. **Build issues**: Run `mvn clean install` to refresh dependencies

## License

This project is open source and available under the MIT License.

## Credits

- Weather data provided by [Open-Meteo API](https://open-meteo.com/)
- UI components from [Bootstrap](https://getbootstrap.com/)
- Icons from [Font Awesome](https://fontawesome.com/)

