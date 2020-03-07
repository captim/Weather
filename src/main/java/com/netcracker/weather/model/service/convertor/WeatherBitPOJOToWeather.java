package com.netcracker.weather.model.service.convertor;

import com.netcracker.weather.controller.MainController;
import com.netcracker.weather.model.Weather;
import com.netcracker.weather.model.service.pojo.weatherbit.WeatherBitPOJO;
import org.apache.log4j.Logger;
import org.springframework.core.convert.converter.Converter;

public class WeatherBitPOJOToWeather
        implements Converter<WeatherBitPOJO, Weather> {
    private final static Logger logger = Logger.getLogger(WeatherBitPOJOToWeather.class);
    @Override
    public Weather convert(WeatherBitPOJO w) {
        logger.debug("WeatherBitPOJO is converting to Weather");
        try {
            return new Weather(w.getData().get(0).getTemp(),
                    w.getData().get(0).getWeather().getDescription(),
                    w.getData().get(0).getWindSpd(),
                    w.getData().get(0).getWindDir(),
                    w.getData().get(0).getClouds());
        } catch (NullPointerException e) {
            logger.error(MainController.error, e);
            return null;
        }
    }
}
