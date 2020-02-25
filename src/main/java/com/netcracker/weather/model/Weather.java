package com.netcracker.weather.model;

import java.util.Objects;

public class Weather {
    private String apiId;
    private double temperature;
    private String weatherDescription;
    private double windSpeed;
    private double windDegree;
    private double cloudCover;

    public Weather(double temperature, String weatherDescription,
                   double windSpeed, double windDegree, double cloudCover) {
        this.temperature = temperature;
        this.weatherDescription = weatherDescription;
        this.windSpeed = windSpeed;
        this.windDegree = windDegree;
        this.cloudCover = cloudCover;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Weather weather = (Weather) o;
        return Double.compare(weather.temperature, temperature) == 0 &&
                Double.compare(weather.windSpeed, windSpeed) == 0 &&
                Double.compare(weather.windDegree, windDegree) == 0 &&
                Double.compare(weather.cloudCover, cloudCover) == 0 &&
                Objects.equals(apiId, weather.apiId) &&
                Objects.equals(weatherDescription, weather.weatherDescription);
    }

    @Override
    public int hashCode() {
        return Objects.hash(apiId, temperature, weatherDescription, windSpeed, windDegree, cloudCover);
    }

    @Override
    public String toString() {
        return "Weather{" +
                "apiId='" + apiId + '\'' +
                ", temperature=" + temperature +
                ", weatherDescription='" + weatherDescription + '\'' +
                ", windSpeed=" + windSpeed +
                ", windDegree=" + windDegree +
                ", cloudCover=" + cloudCover +
                '}';
    }

    public String getApiId() {
        return apiId;
    }

    public void setApiId(String apiId) {
        this.apiId = apiId;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public String getWeatherDescription() {
        return weatherDescription;
    }

    public void setWeatherDescription(String weatherDescription) {
        this.weatherDescription = weatherDescription;
    }

    public double getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(double windSpeed) {
        this.windSpeed = windSpeed;
    }

    public double getWindDegree() {
        return windDegree;
    }

    public void setWindDegree(double windDegree) {
        this.windDegree = windDegree;
    }

    public double getCloudCover() {
        return cloudCover;
    }

    public void setCloudCover(double cloudCover) {
        this.cloudCover = cloudCover;
    }
}
