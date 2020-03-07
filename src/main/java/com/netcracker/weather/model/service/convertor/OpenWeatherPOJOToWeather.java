package com.netcracker.weather.model.service.convertor;

import com.netcracker.weather.controller.MainController;
import com.netcracker.weather.model.Weather;
import com.netcracker.weather.model.service.pojo.openweather.OpenWeatherPOJO;
import org.apache.log4j.Logger;
import org.springframework.core.convert.converter.Converter;

public class OpenWeatherPOJOToWeather
        implements Converter<OpenWeatherPOJO, Weather> {
    private final static Logger logger = Logger.getLogger(OpenWeatherPOJOToWeather.class);
    @Override
    public Weather convert(OpenWeatherPOJO w) {
        logger.debug("OpenWeatherPOJO is converting to Weather");
        try {
            return new Weather(w.getMain().getTemp() - 273,
                    w.getWeather().get(0).getDescription(), w.getWind().getSpeed(),
                    w.getWind().getDeg(), w.getClouds().getAll());
        } catch (NullPointerException e) {
            logger.error(MainController.error, e);
            return null;
        }
    }
}
