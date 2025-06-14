package com.weather.webapp.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CurrentUnits {
    private String time;
    private String interval;
    
    @JsonProperty("temperature_2m")
    private String temperature2m;
    
    @JsonProperty("relative_humidity_2m")
    private String relativeHumidity2m;
    
    @JsonProperty("apparent_temperature")
    private String apparentTemperature;
    
    @JsonProperty("is_day")
    private String isDay;
    
    private String precipitation;
    private String rain;
    private String showers;
    private String snowfall;
    
    @JsonProperty("weather_code")
    private String weatherCode;
    
    @JsonProperty("cloud_cover")
    private String cloudCover;
    
    @JsonProperty("pressure_msl")
    private String pressureMsl;
    
    @JsonProperty("surface_pressure")
    private String surfacePressure;
    
    @JsonProperty("wind_speed_10m")
    private String windSpeed10m;
    
    @JsonProperty("wind_direction_10m")
    private String windDirection10m;
    
    @JsonProperty("wind_gusts_10m")
    private String windGusts10m;

    // Getters and Setters
    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getInterval() {
        return interval;
    }

    public void setInterval(String interval) {
        this.interval = interval;
    }

    public String getTemperature2m() {
        return temperature2m;
    }

    public void setTemperature2m(String temperature2m) {
        this.temperature2m = temperature2m;
    }

    public String getRelativeHumidity2m() {
        return relativeHumidity2m;
    }

    public void setRelativeHumidity2m(String relativeHumidity2m) {
        this.relativeHumidity2m = relativeHumidity2m;
    }

    public String getApparentTemperature() {
        return apparentTemperature;
    }

    public void setApparentTemperature(String apparentTemperature) {
        this.apparentTemperature = apparentTemperature;
    }

    public String getIsDay() {
        return isDay;
    }

    public void setIsDay(String isDay) {
        this.isDay = isDay;
    }

    public String getPrecipitation() {
        return precipitation;
    }

    public void setPrecipitation(String precipitation) {
        this.precipitation = precipitation;
    }

    public String getRain() {
        return rain;
    }

    public void setRain(String rain) {
        this.rain = rain;
    }

    public String getShowers() {
        return showers;
    }

    public void setShowers(String showers) {
        this.showers = showers;
    }

    public String getSnowfall() {
        return snowfall;
    }

    public void setSnowfall(String snowfall) {
        this.snowfall = snowfall;
    }

    public String getWeatherCode() {
        return weatherCode;
    }

    public void setWeatherCode(String weatherCode) {
        this.weatherCode = weatherCode;
    }

    public String getCloudCover() {
        return cloudCover;
    }

    public void setCloudCover(String cloudCover) {
        this.cloudCover = cloudCover;
    }

    public String getPressureMsl() {
        return pressureMsl;
    }

    public void setPressureMsl(String pressureMsl) {
        this.pressureMsl = pressureMsl;
    }

    public String getSurfacePressure() {
        return surfacePressure;
    }

    public void setSurfacePressure(String surfacePressure) {
        this.surfacePressure = surfacePressure;
    }

    public String getWindSpeed10m() {
        return windSpeed10m;
    }

    public void setWindSpeed10m(String windSpeed10m) {
        this.windSpeed10m = windSpeed10m;
    }

    public String getWindDirection10m() {
        return windDirection10m;
    }

    public void setWindDirection10m(String windDirection10m) {
        this.windDirection10m = windDirection10m;
    }

    public String getWindGusts10m() {
        return windGusts10m;
    }

    public void setWindGusts10m(String windGusts10m) {
        this.windGusts10m = windGusts10m;
    }
}

