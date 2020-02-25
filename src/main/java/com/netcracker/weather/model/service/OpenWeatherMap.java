package com.netcracker.weather.model.service;

import com.netcracker.weather.model.Weather;
import com.netcracker.weather.model.service.pojo.openweather.OpenWeatherPOJO;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.convert.ConversionService;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
@PropertySource("classpath:/application.properties")
public class OpenWeatherMap implements WeatherAPI {
    @Value(value = "${api.weather.openweathermap.id}")
    private String id;
    @Value(value = "${api.weather.openweathermap.key}")
    private String key;
    @Autowired
    private ConversionService conversionService;
    @Override
    public Weather getRequest(String city) throws IOException {
        HttpClient httpClient = HttpClients.createDefault();
        String http = "http://api.openweathermap.org/data/2.5/weather?q="
                + city + "&APPID=" + key;
        HttpGet httpGet = new HttpGet(http);
        HttpResponse httpResponse = httpClient.execute(httpGet);
        return createWeather(EntityUtils.toString(httpResponse.getEntity()));
    }

    public Weather createWeather(String json) {
        Weather weather =
                conversionService.convert(conversionService.convert(json,
                OpenWeatherPOJO.class), Weather.class);
        weather.setApiId(id);
        return weather;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public void setId(String id) {
        this.id = id;
    }
}
