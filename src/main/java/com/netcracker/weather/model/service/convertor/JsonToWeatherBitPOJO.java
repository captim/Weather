package com.netcracker.weather.model.service.convertor;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.netcracker.weather.model.service.pojo.weatherbit.WeatherBitPOJO;
import org.springframework.core.convert.converter.Converter;

public class JsonToWeatherBitPOJO implements Converter<String, WeatherBitPOJO> {
    @Override
    public WeatherBitPOJO convert(String s) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return mapper.readValue(s, WeatherBitPOJO.class);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            return null;
        }
    }
}
