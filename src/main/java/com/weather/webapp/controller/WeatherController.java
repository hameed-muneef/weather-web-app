package com.weather.webapp.controller;

import com.weather.webapp.model.WeatherResponse;
import com.weather.webapp.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import reactor.core.publisher.Mono;

@Controller
public class WeatherController {

    @Autowired
    private WeatherService weatherService;

    @GetMapping("/")
    public String index(Model model) {
        // Set default coordinates (New York City)
        model.addAttribute("latitude", "40.7128");
        model.addAttribute("longitude", "-74.0060");
        return "index";
    }

    @PostMapping("/weather")
    public String getWeather(@RequestParam("latitude") String latitudeStr,
                           @RequestParam("longitude") String longitudeStr,
                           Model model) {
        try {
            double latitude = Double.parseDouble(latitudeStr);
            double longitude = Double.parseDouble(longitudeStr);

            // Validate coordinates
            if (latitude < -90 || latitude > 90 || longitude < -180 || longitude > 180) {
                model.addAttribute("error", "Invalid coordinates. Latitude must be between -90 and 90, longitude between -180 and 180.");
                model.addAttribute("latitude", latitudeStr);
                model.addAttribute("longitude", longitudeStr);
                return "index";
            }

            Mono<WeatherResponse> weatherMono = weatherService.getCurrentWeather(latitude, longitude);
            WeatherResponse weather = weatherMono.block(); // Block for synchronous processing

            if (weather != null && weather.getCurrent() != null) {
                model.addAttribute("weather", weather);
                model.addAttribute("weatherDescription", weatherService.getWeatherDescription(weather.getCurrent().getWeatherCode()));
                model.addAttribute("windDirection", weatherService.getWindDirection(weather.getCurrent().getWindDirection10m()));
                model.addAttribute("weatherIcon", weatherService.getWeatherIcon(weather.getCurrent().getWeatherCode(), weather.getCurrent().getIsDay()));
                model.addAttribute("latitude", latitudeStr);
                model.addAttribute("longitude", longitudeStr);
            } else {
                model.addAttribute("error", "Failed to fetch weather data. Please check your coordinates and try again.");
                model.addAttribute("latitude", latitudeStr);
                model.addAttribute("longitude", longitudeStr);
            }

        } catch (NumberFormatException e) {
            model.addAttribute("error", "Please enter valid numeric coordinates.");
            model.addAttribute("latitude", latitudeStr);
            model.addAttribute("longitude", longitudeStr);
        } catch (Exception e) {
            model.addAttribute("error", "An error occurred while fetching weather data: " + e.getMessage());
            model.addAttribute("latitude", latitudeStr);
            model.addAttribute("longitude", longitudeStr);
        }

        return "index";
    }
}

