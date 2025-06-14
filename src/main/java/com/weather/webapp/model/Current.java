package com.weather.webapp.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Current {
    private String time;
    private int interval;
    
    @JsonProperty("temperature_2m")
    private double temperature2m;
    
    @JsonProperty("relative_humidity_2m")
    private int relativeHumidity2m;
    
    @JsonProperty("apparent_temperature")
    private double apparentTemperature;
    
    @JsonProperty("is_day")
    private int isDay;
    
    private double precipitation;
    private double rain;
    private double showers;
    private double snowfall;
    
    @JsonProperty("weather_code")
    private int weatherCode;
    
    @JsonProperty("cloud_cover")
    private int cloudCover;
    
    @JsonProperty("pressure_msl")
    private double pressureMsl;
    
    @JsonProperty("surface_pressure")
    private double surfacePressure;
    
    @JsonProperty("wind_speed_10m")
    private double windSpeed10m;
    
    @JsonProperty("wind_direction_10m")
    private int windDirection10m;
    
    @JsonProperty("wind_gusts_10m")
    private double windGusts10m;

    // Getters and Setters
    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getInterval() {
        return interval;
    }

    public void setInterval(int interval) {
        this.interval = interval;
    }

    public double getTemperature2m() {
        return temperature2m;
    }

    public void setTemperature2m(double temperature2m) {
        this.temperature2m = temperature2m;
    }

    public int getRelativeHumidity2m() {
        return relativeHumidity2m;
    }

    public void setRelativeHumidity2m(int relativeHumidity2m) {
        this.relativeHumidity2m = relativeHumidity2m;
    }

    public double getApparentTemperature() {
        return apparentTemperature;
    }

    public void setApparentTemperature(double apparentTemperature) {
        this.apparentTemperature = apparentTemperature;
    }

    public int getIsDay() {
        return isDay;
    }

    public void setIsDay(int isDay) {
        this.isDay = isDay;
    }

    public double getPrecipitation() {
        return precipitation;
    }

    public void setPrecipitation(double precipitation) {
        this.precipitation = precipitation;
    }

    public double getRain() {
        return rain;
    }

    public void setRain(double rain) {
        this.rain = rain;
    }

    public double getShowers() {
        return showers;
    }

    public void setShowers(double showers) {
        this.showers = showers;
    }

    public double getSnowfall() {
        return snowfall;
    }

    public void setSnowfall(double snowfall) {
        this.snowfall = snowfall;
    }

    public int getWeatherCode() {
        return weatherCode;
    }

    public void setWeatherCode(int weatherCode) {
        this.weatherCode = weatherCode;
    }

    public int getCloudCover() {
        return cloudCover;
    }

    public void setCloudCover(int cloudCover) {
        this.cloudCover = cloudCover;
    }

    public double getPressureMsl() {
        return pressureMsl;
    }

    public void setPressureMsl(double pressureMsl) {
        this.pressureMsl = pressureMsl;
    }

    public double getSurfacePressure() {
        return surfacePressure;
    }

    public void setSurfacePressure(double surfacePressure) {
        this.surfacePressure = surfacePressure;
    }

    public double getWindSpeed10m() {
        return windSpeed10m;
    }

    public void setWindSpeed10m(double windSpeed10m) {
        this.windSpeed10m = windSpeed10m;
    }

    public int getWindDirection10m() {
        return windDirection10m;
    }

    public void setWindDirection10m(int windDirection10m) {
        this.windDirection10m = windDirection10m;
    }

    public double getWindGusts10m() {
        return windGusts10m;
    }

    public void setWindGusts10m(double windGusts10m) {
        this.windGusts10m = windGusts10m;
    }
}

