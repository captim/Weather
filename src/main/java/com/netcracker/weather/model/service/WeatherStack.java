package com.netcracker.weather.model.service;

import com.netcracker.weather.model.Weather;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
@PropertySource("classpath:/application.properties")
public class WeatherStack implements WeatherAPI {
    @Value(value = "${api.weather.weatherstack.id}")
    private String id;
    @Override
    public Weather getRequest(String city) throws IOException {
        HttpClient httpClient = HttpClients.createDefault();
        String http = "http://api.weatherstack.com/current?access_key=" +
                "5434e0086e05699b55d699289d46bc66&query=" + city;
        HttpGet httpGet = new HttpGet(http);
        HttpResponse httpResponse = httpClient.execute(httpGet);
        return createWeather(EntityUtils.toString(httpResponse.getEntity()));
    }
    public Weather createWeather(String json) {
        JSONObject jsonObject = new JSONObject(json);
        JSONObject current = jsonObject.getJSONObject("current");
        int temperature = current.getInt("temperature");
        JSONArray weatherDescriptions = current.getJSONArray("weather_descriptions");
        String weatherDescription = weatherDescriptions.getString(0);
        double windSpeed = current.getFloat("wind_speed") / 3.6;
        float windDegree = current.getFloat("wind_degree");
        float cloudCover = current.getFloat("cloudcover");
        return new Weather(getId(), temperature, weatherDescription, (float) windSpeed,
                windDegree, cloudCover);
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
