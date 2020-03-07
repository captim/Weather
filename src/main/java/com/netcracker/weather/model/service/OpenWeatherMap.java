package com.netcracker.weather.model.service;

import com.netcracker.weather.controller.MainController;
import com.netcracker.weather.model.Weather;
import com.netcracker.weather.model.service.pojo.openweather.OpenWeatherPOJO;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.convert.ConversionService;
import org.springframework.stereotype.Service;
import org.springframework.web.util.UriComponentsBuilder;

import java.io.IOException;

@Service
@PropertySource("classpath:/application.properties")
public class OpenWeatherMap implements WeatherAPI {
    @Value(value = "${api.weather.openweathermap.id}")
    private String id;
    @Value(value = "${api.weather.openweathermap.key}")
    private String key;
    private final ConversionService conversionService;
    private final static Logger logger = Logger.getLogger(OpenWeatherMap.class);

    @Autowired
    public OpenWeatherMap(ConversionService conversionService) {
        this.conversionService = conversionService;
    }

    @Override
    public Weather getRequest(String city) {
        logger.info(MainController.gettingRequest + getId());
        String url = "http://api.openweathermap.org/data/2.5/weather";
        UriComponentsBuilder builder = UriComponentsBuilder.fromUriString(url)
                .queryParam("q", city)
                .queryParam("APPID", key);
        HttpClient httpClient = HttpClients.createDefault();
        HttpGet httpGet = new HttpGet(builder.build().encode().toUriString());
        HttpResponse httpResponse;
        try {
            httpResponse = httpClient.execute(httpGet);
            return createWeather(EntityUtils.toString(httpResponse.getEntity()));
        } catch (IOException e) {
            logger.error(MainController.error, e);
            return null;
        }
    }

    public Weather createWeather(String json) {
        Weather weather =
                conversionService.convert(conversionService.convert(json,
                OpenWeatherPOJO.class), Weather.class);
        if (weather == null) {
            return null;
        }
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
