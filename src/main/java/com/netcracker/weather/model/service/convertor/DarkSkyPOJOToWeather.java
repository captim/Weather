package com.netcracker.weather.model.service.convertor;

import com.netcracker.weather.model.Weather;
import com.netcracker.weather.model.service.pojo.darksky.DarkSkyPOJO;
import org.springframework.core.convert.converter.Converter;

public class DarkSkyPOJOToWeather implements Converter<DarkSkyPOJO, Weather> {
    @Override
    public Weather convert(DarkSkyPOJO w) {
        return new Weather((w.getCurrently().getTemperature() - 32) * 5 / 9,
                w.getCurrently().getSummary(),
                w.getCurrently().getWindSpeed() * 0.44704,
                w.getCurrently().getWindBearing(),
                w.getCurrently().getCloudCover() * 100);
    }
}
