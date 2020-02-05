package com.netcracker.weather.model;

public class Weather {
    private String apiId;
    private float temperature;
    private String weatherDescription;
    private float windSpeed;
    private float windDegree;
    private float cloudCover;

    public Weather(String apiId, float temperature, String weatherDescription, float windSpeed, float windDegree, float cloudCover) {
        this.apiId = apiId;
        this.temperature = temperature;
        this.weatherDescription = weatherDescription;
        this.windSpeed = windSpeed;
        this.windDegree = windDegree;
        this.cloudCover = cloudCover;
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

    public float getTemperature() {
        return temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    public String getWeatherDescription() {
        return weatherDescription;
    }

    public void setWeatherDescription(String weatherDescription) {
        this.weatherDescription = weatherDescription;
    }

    public float getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(float windSpeed) {
        this.windSpeed = windSpeed;
    }

    public float getWindDegree() {
        return windDegree;
    }

    public void setWindDegree(float windDegree) {
        this.windDegree = windDegree;
    }

    public float getCloudCover() {
        return cloudCover;
    }

    public void setCloudCover(float cloudCover) {
        this.cloudCover = cloudCover;
    }
}
