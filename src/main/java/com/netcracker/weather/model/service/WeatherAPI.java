package com.netcracker.weather.model.service;

import com.netcracker.weather.model.Weather;

import java.io.IOException;

public interface WeatherAPI {
    Weather getRequest(String city);
    Weather createWeather(String json);
    String getId();
    void setId(String id);
}
