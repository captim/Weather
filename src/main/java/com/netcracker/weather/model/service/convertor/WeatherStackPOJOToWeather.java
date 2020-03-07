package com.netcracker.weather.model.service.convertor;

import com.netcracker.weather.controller.MainController;
import com.netcracker.weather.model.Weather;
import com.netcracker.weather.model.service.pojo.weatherstack.WeatherStackPOJO;
import org.apache.log4j.Logger;
import org.springframework.core.convert.converter.Converter;

public class WeatherStackPOJOToWeather
        implements Converter<WeatherStackPOJO, Weather> {
    private final static Logger logger = Logger.getLogger(WeatherStackPOJOToWeather.class);
    @Override
    public Weather convert(WeatherStackPOJO w) {
        logger.debug("WeatherStackPOJO is converting to Weather");
        try {
            return new Weather(w.getCurrent().getTemperature(),
                    String.join(" ", w.getCurrent().getWeatherDescriptions()),
                    w.getCurrent().getWindSpeed() / 3.6, w.getCurrent().getWindDegree(),
                    w.getCurrent().getCloudcover());
        } catch (NullPointerException e) {
            logger.error(MainController.error, e);
            return null;
        }
    }
}
