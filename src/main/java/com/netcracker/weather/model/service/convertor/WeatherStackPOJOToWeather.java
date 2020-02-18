package com.netcracker.weather.model.service.convertor;

import com.netcracker.weather.model.Weather;
import com.netcracker.weather.model.service.pojo.weatherstack.WeatherStackPOJO;
import org.springframework.core.convert.converter.Converter;

public class WeatherStackPOJOToWeather
        implements Converter<WeatherStackPOJO, Weather> {
    @Override
    public Weather convert(WeatherStackPOJO w) {
        return new Weather(w.getCurrent().getTemperature(),
                String.join(" ", w.getCurrent().getWeatherDescriptions()),
                w.getCurrent().getWindSpeed() / 3.6, w.getCurrent().getWindDegree(),
                w.getCurrent().getCloudcover());
    }
}
