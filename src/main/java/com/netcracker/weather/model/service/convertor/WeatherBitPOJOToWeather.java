package com.netcracker.weather.model.service.convertor;

import com.netcracker.weather.model.Weather;
import com.netcracker.weather.model.service.pojo.weatherbit.WeatherBitPOJO;
import org.springframework.core.convert.converter.Converter;

public class WeatherBitPOJOToWeather
        implements Converter<WeatherBitPOJO, Weather> {
    @Override
    public Weather convert(WeatherBitPOJO w) {
        return new Weather(w.getData().get(0).getTemp(),
                w.getData().get(0).getWeather().getDescription(),
                w.getData().get(0).getWindSpd(),
                w.getData().get(0).getWindDir(),
                w.getData().get(0).getClouds());

    }
}
