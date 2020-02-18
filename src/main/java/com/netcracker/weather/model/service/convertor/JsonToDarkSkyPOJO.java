package com.netcracker.weather.model.service.convertor;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.netcracker.weather.model.service.pojo.darksky.DarkSkyPOJO;
import org.springframework.core.convert.converter.Converter;

public class JsonToDarkSkyPOJO implements Converter<String, DarkSkyPOJO> {
    @Override
    public DarkSkyPOJO convert(String s) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return mapper.readValue(s, DarkSkyPOJO.class);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            return null;
        }
    }
}
