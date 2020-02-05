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
public class OpenWeatherMap implements WeatherAPI {
    @Value(value = "${api.weather.openweathermap.id}")
    private String id;
    @Override
    public Weather getRequest(String city) throws IOException {
        HttpClient httpClient = HttpClients.createDefault();
        String http = "http://api.openweathermap.org/data/2.5/weather?q="
                + city + "&APPID=fc90d9dd3d3211dbeefb95f3d91dbf86";
        HttpGet httpGet = new HttpGet(http);
        HttpResponse httpResponse = httpClient.execute(httpGet);
        return createWeather(EntityUtils.toString(httpResponse.getEntity()));
    }

    @Override
    public Weather createWeather(String json) {
        JSONObject jsonObject = new JSONObject(json);
        JSONArray weather = jsonObject.getJSONArray("weather");
        JSONObject weather0 = weather.getJSONObject(0);
        String weatherDescription = weather0.getString("description");
        JSONObject main = jsonObject.getJSONObject("main");
        float temperature = 273 - main.getFloat("temp");
        JSONObject wind = jsonObject.getJSONObject("wind");
        float windSpeed = wind.getFloat("speed");
        float windDegree = wind.getFloat("deg");
        JSONObject clouds = jsonObject.getJSONObject("clouds");
        float cloudCover = clouds.getFloat("all");
        return new Weather(getId(), temperature, weatherDescription, windSpeed, windDegree, cloudCover);
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
