package com.weather.webapp.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class WeatherResponse {
    private double latitude;
    private double longitude;
    
    @JsonProperty("generationtime_ms")
    private double generationTimeMs;
    
    @JsonProperty("utc_offset_seconds")
    private int utcOffsetSeconds;
    
    private String timezone;
    
    @JsonProperty("timezone_abbreviation")
    private String timezoneAbbreviation;
    
    private double elevation;
    
    @JsonProperty("current_units")
    private CurrentUnits currentUnits;
    
    private Current current;

    // Getters and Setters
    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getGenerationTimeMs() {
        return generationTimeMs;
    }

    public void setGenerationTimeMs(double generationTimeMs) {
        this.generationTimeMs = generationTimeMs;
    }

    public int getUtcOffsetSeconds() {
        return utcOffsetSeconds;
    }

    public void setUtcOffsetSeconds(int utcOffsetSeconds) {
        this.utcOffsetSeconds = utcOffsetSeconds;
    }

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public String getTimezoneAbbreviation() {
        return timezoneAbbreviation;
    }

    public void setTimezoneAbbreviation(String timezoneAbbreviation) {
        this.timezoneAbbreviation = timezoneAbbreviation;
    }

    public double getElevation() {
        return elevation;
    }

    public void setElevation(double elevation) {
        this.elevation = elevation;
    }

    public CurrentUnits getCurrentUnits() {
        return currentUnits;
    }

    public void setCurrentUnits(CurrentUnits currentUnits) {
        this.currentUnits = currentUnits;
    }

    public Current getCurrent() {
        return current;
    }

    public void setCurrent(Current current) {
        this.current = current;
    }
}

