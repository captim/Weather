package com.netcracker.weather.model.service.convertor;

import com.netcracker.weather.model.Weather;
import com.netcracker.weather.model.service.pojo.openweather.OpenWeatherPOJO;
import org.springframework.core.convert.converter.Converter;

public class OpenWeatherPOJOToWeather
        implements Converter<OpenWeatherPOJO, Weather> {
    @Override
    public Weather convert(OpenWeatherPOJO w) {
        return new Weather(w.getMain().getTemp() - 273,
                w.getWeather().get(0).getDescription(), w.getWind().getSpeed(),
                w.getWind().getDeg(), w.getClouds().getAll());
    }
}
