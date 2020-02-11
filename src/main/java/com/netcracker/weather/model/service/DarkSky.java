package com.netcracker.weather.model.service;

import com.netcracker.weather.model.Weather;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
@PropertySource("classpath:/application.properties")
public class DarkSky implements WeatherAPI {
    @Value(value = "${api.weather.darksky.id}")
    String id;
    @Override
        public Weather getRequest(String city) throws IOException {
        HttpClient httpClient = HttpClients.createDefault();
        String http = "https://api.darksky.net/forecast/" +
                "847f3c0dd5c3c764da852fd9f0de32d6/50.9216,34.80029";
        HttpGet httpGet = new HttpGet(http);
        HttpResponse httpResponse = httpClient.execute(httpGet);
        return createWeather(EntityUtils.toString(httpResponse.getEntity()));
    }

    @Override
    public Weather createWeather(String json) {
        JSONObject jsonObject = new JSONObject(json);
        JSONObject currently = jsonObject.getJSONObject("currently");
        String weatherDescription = currently.getString("summary");
        float temperature = (currently.getFloat("temperature") - 32) * 5 / 9; // перевести в цельсии
        double windSpeed = currently.getFloat("windSpeed") * 0.44704;
        float windDegree = currently.getFloat("windBearing");
        float cloudCover = currently.getFloat("cloudCover") * 100;
        return new Weather(getId(), temperature, weatherDescription,
                (float) windSpeed, windDegree, cloudCover);
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
