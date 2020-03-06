package com.netcracker.weather.model.service.convertor;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.netcracker.weather.model.service.pojo.weatherbit.WeatherBitPOJO;
import org.apache.log4j.Logger;
import org.springframework.core.convert.converter.Converter;

public class JsonToWeatherBitPOJO implements Converter<String, WeatherBitPOJO> {
    private final static Logger logger = Logger.getLogger(JsonToWeatherBitPOJO.class);
    @Override
    public WeatherBitPOJO convert(String s) {
        logger.debug("Json is converting to WeatherBitPOJO");
        ObjectMapper mapper = new ObjectMapper();
        try {
            return mapper.readValue(s, WeatherBitPOJO.class);
        } catch (JsonProcessingException e) {
            logger.error("JsonProcessingException");
            return null;
        }
    }
}
