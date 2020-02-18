package com.netcracker.weather.model.service.convertor;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.netcracker.weather.model.service.pojo.openweather.OpenWeatherPOJO;
import org.springframework.core.convert.converter.Converter;

public class JsonToOpenWeatherPOJO
        implements Converter<String, OpenWeatherPOJO> {

    @Override
    public OpenWeatherPOJO convert(String s) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return mapper.readValue(s, OpenWeatherPOJO.class);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            return null;
        }
    }
}
