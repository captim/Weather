package com.netcracker.weather.model.service;

import com.netcracker.weather.controller.MainController;
import com.netcracker.weather.model.Weather;
import com.netcracker.weather.model.service.pojo.darksky.DarkSkyPOJO;
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

import java.io.IOException;

@Service
@PropertySource("classpath:/application.properties")
public class DarkSky implements WeatherAPI {
    @Value(value = "${api.weather.darksky.id}")
    private String id;
    @Value(value = "${api.weather.darksky.key}")
    private String key;
    private final ConversionService conversionService;
    private final static Logger logger = Logger.getLogger(DarkSky.class);
    @Autowired
    public DarkSky(ConversionService conversionService) {
        this.conversionService = conversionService;
    }

    @Override
        public Weather getRequest(String city) {
        logger.info(MainController.gettingRequest + getId());
        HttpClient httpClient = HttpClients.createDefault();
        String http = "https://api.darksky.net/forecast/"
                 + key + "/50.9216,34.80029";
        HttpGet httpGet = new HttpGet(http);
        HttpResponse httpResponse = null;
        try {
            httpResponse = httpClient.execute(httpGet);
            return createWeather(EntityUtils.toString(httpResponse.getEntity()));
        } catch (IOException e) {
            logger.error("IOException");
            return null;
        }
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
