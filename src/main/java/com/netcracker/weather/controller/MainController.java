package com.netcracker.weather.controller;

import com.netcracker.weather.model.Weather;
import com.netcracker.weather.model.service.WeatherAPI;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

@RestController
public class MainController {
    private List<WeatherAPI> list;
    private final WeatherAPI weatherStack;
    private final WeatherAPI openWeatherMap;
    private final WeatherAPI darkSky;
    @Value(value = "${api.weather.numberofthread}")
    int numberOfThread;
    public MainController(WeatherAPI weatherStack, WeatherAPI openWeatherMap, WeatherAPI darkSky) {
        this.weatherStack = weatherStack;
        this.openWeatherMap = openWeatherMap;
        this.darkSky = darkSky;
        list = new ArrayList<>();
        list.add(weatherStack);
        list.add(openWeatherMap);
        list.add(darkSky);
    }
    @RequestMapping(value="/w1", method=RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public Weather weatherStack(@RequestParam(defaultValue = "sumy") String city)
            throws IOException {
        return weatherStack.getRequest(city);
    }
    @RequestMapping(value="/w2", method=RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public Weather openWeather(@RequestParam(defaultValue = "sumy") String city)
            throws IOException {
        return openWeatherMap.getRequest(city);
    }
    @RequestMapping(value="/w3", method=RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public Weather darkSky(@RequestParam(defaultValue = "sumy") String city)
            throws IOException {
        return darkSky.getRequest(city);
    }
    @RequestMapping(value="/w", method=RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public List<Weather> allWeather(@RequestParam(defaultValue = "sumy") String city)
            throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(numberOfThread);
        ExecutorCompletionService<Weather> completionService
                = new ExecutorCompletionService<>(executorService);
        List<Weather> weatherList = new ArrayList<>();
        for (WeatherAPI temp: list) {
            Future<Weather> submit = completionService.submit(() -> temp.getRequest(city));
            weatherList.add(submit.get());
        }
        return weatherList;
    }
}