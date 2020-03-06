package com.netcracker.weather.model.service.convertor;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.netcracker.weather.model.service.pojo.openweather.OpenWeatherPOJO;
import org.apache.log4j.Logger;
import org.springframework.core.convert.converter.Converter;

public class JsonToOpenWeatherPOJO
        implements Converter<String, OpenWeatherPOJO> {
    private final static Logger logger = Logger.getLogger(JsonToOpenWeatherPOJO.class);
    @Override
    public OpenWeatherPOJO convert(String s) {
        logger.debug("Json is converting to OpenWeatherPOJO");
        ObjectMapper mapper = new ObjectMapper();
        try {
            return mapper.readValue(s, OpenWeatherPOJO.class);
        } catch (JsonProcessingException e) {
            logger.error("JsonProcessingException");
            return null;
        }
    }
}
