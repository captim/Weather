package com.netcracker.weather.model.service;

import com.netcracker.weather.model.Weather;
import com.netcracker.weather.model.service.pojo.darksky.DarkSkyPOJO;
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
public class DarkSky implements WeatherAPI {
    @Value(value = "${api.weather.darksky.id}")
    private String id;
    @Value(value = "${api.weather.darksky.key}")
    private String key;
    @Autowired
    private ConversionService conversionService;
    @Override
        public Weather getRequest(String city) throws IOException {
        HttpClient httpClient = HttpClients.createDefault();
        String http = "https://api.darksky.net/forecast/"
                 + key + "/50.9216,34.80029";
        HttpGet httpGet = new HttpGet(http);
        HttpResponse httpResponse = httpClient.execute(httpGet);
        return createWeather(EntityUtils.toString(httpResponse.getEntity()));
    }

    @Override
    public Weather createWeather(String json) {
        Weather weather =
                conversionService.convert(conversionService.convert(json,
                        DarkSkyPOJO.class), Weather.class);
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
