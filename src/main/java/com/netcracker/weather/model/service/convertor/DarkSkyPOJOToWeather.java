package com.netcracker.weather.model.service.convertor;

import com.netcracker.weather.model.Weather;
import com.netcracker.weather.model.service.pojo.darksky.DarkSkyPOJO;
import org.apache.log4j.Logger;
import org.springframework.core.convert.converter.Converter;

public class DarkSkyPOJOToWeather implements Converter<DarkSkyPOJO, Weather> {
    private final static Logger logger = Logger.getLogger(DarkSkyPOJOToWeather.class);
    @Override
    public Weather convert(DarkSkyPOJO w) {
        logger.debug("DarkSkyPOJO is converting to weather");
        return new Weather((w.getCurrently().getTemperature() - 32) * 5 / 9,
                w.getCurrently().getSummary(),
                w.getCurrently().getWindSpeed() * 0.44704,
                w.getCurrently().getWindBearing(),
                w.getCurrently().getCloudCover() * 100);
    }
}
