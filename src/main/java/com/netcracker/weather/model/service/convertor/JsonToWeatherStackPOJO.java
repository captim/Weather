package com.netcracker.weather.model.service.convertor;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.netcracker.weather.model.service.pojo.weatherstack.WeatherStackPOJO;
import org.springframework.core.convert.converter.Converter;

public class JsonToWeatherStackPOJO
        implements Converter<String, WeatherStackPOJO> {
    @Override
    public WeatherStackPOJO convert(String s) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return mapper.readValue(s, WeatherStackPOJO.class);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            return null;
        }
    }
}
