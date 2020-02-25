package com.netcracker.weather.controller;

import com.netcracker.weather.model.Weather;
import com.netcracker.weather.model.service.WeatherAPI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

@RestController
public class MainController {
    private final List<WeatherAPI> list;
    private final WeatherAPI weatherStack;
    private final WeatherAPI openWeatherMap;
    private final WeatherAPI darkSky;
    private final WeatherAPI weatherBit;
    @Value(value = "${api.weather.numberofthread}")
    int numberOfThread;
    @Autowired
    public MainController(WeatherAPI weatherStack, WeatherAPI openWeatherMap,
                          WeatherAPI darkSky, WeatherAPI weatherBit) {
        this.weatherStack = weatherStack;
        this.openWeatherMap = openWeatherMap;
        this.darkSky = darkSky;
        this.weatherBit = weatherBit;
        list = new ArrayList<>();
        list.add(this.weatherStack);
        list.add(this.openWeatherMap);
        list.add(this.darkSky);
        list.add(this.weatherBit);
    }
    @RequestMapping(value = "/w1")
    public Weather weatherStack(@RequestParam(defaultValue = "sumy")
                                            String city)
            throws IOException {
        return weatherStack.getRequest(city);
    }
    @RequestMapping(value = "/w2")
    public Weather openWeather(@RequestParam(defaultValue = "sumy") String city)
            throws IOException {
        return openWeatherMap.getRequest(city);
    }
    @RequestMapping(value = "/w3")
    public Weather darkSky(@RequestParam(defaultValue = "sumy") String city)
            throws IOException {
        return darkSky.getRequest(city);
    }
    @RequestMapping(value = "/w4")
    public Weather weatherBit(@RequestParam(defaultValue = "sumy") String city)
            throws IOException {
        return weatherBit.getRequest(city);
    }
    @RequestMapping(value = "/w")
    public List<Weather> allWeather(@RequestParam(defaultValue = "sumy")
                                                String city)
            throws ExecutionException, InterruptedException {
        ExecutorService executorService =
                Executors.newFixedThreadPool(numberOfThread);
        ExecutorCompletionService<Weather> completionService
                = new ExecutorCompletionService<>(executorService);
        List<Weather> weatherList = new ArrayList<>();
        for (WeatherAPI temp: list) {
            Future<Weather> submit =
                    completionService.submit(() -> temp.getRequest(city));
            weatherList.add(submit.get());
        }
        return weatherList;
    }
}