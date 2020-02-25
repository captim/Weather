package com.netcracker.weather.model.service;

import com.netcracker.weather.model.Weather;
import com.netcracker.weather.model.service.pojo.weatherstack.WeatherStackPOJO;
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
import org.springframework.web.util.UriComponentsBuilder;

import java.io.IOException;

@Service
@PropertySource("classpath:/application.properties")
public class WeatherStack implements WeatherAPI {
    @Value(value = "${api.weather.weatherstack.id}")
    private String id;
    @Value(value = "${api.weather.weatherstack.key}")
    private String key;
    private final ConversionService conversionService;
    @Autowired
    public WeatherStack(ConversionService conversionService) {
        this.conversionService = conversionService;
    }

    @Override
    public Weather getRequest(String city) throws IOException {
        String url = "http://api.weatherstack.com/current";
        UriComponentsBuilder builder = UriComponentsBuilder.fromUriString(url)
                .queryParam("access_key", key)
                .queryParam("query", city);
        HttpClient httpClient = HttpClients.createDefault();
        HttpGet httpGet = new HttpGet(builder.build().encode().toUriString());
        HttpResponse httpResponse = httpClient.execute(httpGet);
        return createWeather(EntityUtils.toString(httpResponse.getEntity()));
    }
    public Weather createWeather(String json) {
        Weather weather =
                conversionService.convert(conversionService.convert(json,
                WeatherStackPOJO.class), Weather.class);
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
