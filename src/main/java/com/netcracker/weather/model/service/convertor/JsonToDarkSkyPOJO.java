package com.netcracker.weather.model.service.convertor;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.netcracker.weather.model.service.pojo.darksky.DarkSkyPOJO;
import org.apache.log4j.Logger;
import org.springframework.core.convert.converter.Converter;

public class JsonToDarkSkyPOJO implements Converter<String, DarkSkyPOJO> {
    private final static Logger logger = Logger.getLogger(JsonToDarkSkyPOJO.class);
    @Override
    public DarkSkyPOJO convert(String s) {
        logger.debug("Json is converting to DarkSkyPOJO");
        ObjectMapper mapper = new ObjectMapper();
        try {
            return mapper.readValue(s, DarkSkyPOJO.class);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            return null;
        }
    }
}
