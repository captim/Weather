package com.netcracker.weather.controller;

import com.netcracker.weather.model.Weather;
import com.netcracker.weather.model.service.WeatherAPI;
import com.netcracker.weather.model.service.convertor.WeatherToDoc;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

@RestController
public class MainController {
    private final static Logger logger = Logger.getLogger(MainController.class);
    private final List<WeatherAPI> list;
    private final WeatherAPI weatherStack;
    private final WeatherAPI openWeatherMap;
    private final WeatherAPI darkSky;
    private final WeatherAPI weatherBit;
    private static String gettingDescription = "Getting weather description from ";
    public static String gettingRequest = "Getting request from ";
    public static String error = "Error message";
    private final WeatherToDoc weatherToDoc;
    private final File template = new File("src" + File.separator
            + "main" + File.separator + "resources" + File.separator +"template.docx");
    @Value(value = "${api.weather.numberofthread}")
    private int numberOfThread;
    @Autowired
    public MainController(WeatherAPI weatherStack, WeatherAPI openWeatherMap,
                          WeatherAPI darkSky, WeatherAPI weatherBit,
                          WeatherToDoc weatherToDoc) {
        this.weatherStack = weatherStack;
        this.openWeatherMap = openWeatherMap;
        this.darkSky = darkSky;
        this.weatherBit = weatherBit;
        this.weatherToDoc = weatherToDoc;
        list = new ArrayList<>();
        list.add(this.weatherStack);
        list.add(this.openWeatherMap);
        list.add(this.darkSky);
        list.add(this.weatherBit);
    }
    @RequestMapping(value = "/get-doc",method = RequestMethod.GET)
    public ResponseEntity<InputStreamResource> getDoc
            (@RequestParam(defaultValue = "weatherStack") String api,
             @RequestParam(defaultValue = "sumy") String city) {
        WeatherAPI weatherApi;
        switch (api) {
            case "weatherStack":
                weatherApi = weatherStack;
                break;
            case "OpenWeatherMap":
                weatherApi = openWeatherMap;
                break;
            case "DarkSky":
                weatherApi = darkSky;
                break;
            default:
                weatherApi = weatherBit;
                break;
        }
        Weather weather = weatherApi.getRequest(city);
        byte[] doc = weatherToDoc.writeWeatherToDocByTemplate(template,weather);
        HttpHeaders headers = new HttpHeaders();
        headers.setContentDispositionFormData("attachment", "WeatherWordFile.docx");
        headers.setContentType(new MediaType("application", "vnd.openxmlformats-officedocument.wordprocessingml.document"));
        headers.setContentLength(doc.length);
        InputStreamResource inputStreamResource = new InputStreamResource
                (new ByteArrayInputStream(doc));
        return ResponseEntity.ok()
                .headers(headers)
                .body(inputStreamResource);
    }
    @Cacheable(value = "weatherStack", unless="#result == null")
    @RequestMapping(value = "/w1")
    public Weather weatherStack(@RequestParam(defaultValue = "sumy") String city) {
        logger.info(gettingDescription + weatherStack.getId());
        return weatherStack.getRequest(city);
    }
    @Cacheable(value = "openWeather", unless="#result == null")
    @RequestMapping(value = "/w2")
    public Weather openWeather(@RequestParam(defaultValue = "sumy") String city) {
        logger.info(gettingDescription + openWeatherMap.getId());
        return openWeatherMap.getRequest(city);
    }
    @Cacheable(value = "darkSky", unless="#result == null")
    @RequestMapping(value = "/w3")
    public Weather darkSky(@RequestParam(defaultValue = "sumy") String city) {
        logger.info(gettingDescription + darkSky.getId());
        return darkSky.getRequest(city);
    }
    @Cacheable(value = "weatherBit", unless="#result == null")
    @RequestMapping(value = "/w4")
    public Weather weatherBit(@RequestParam(defaultValue = "sumy") String city) {
        logger.info(gettingDescription + weatherBit.getId());
        return weatherBit.getRequest(city);
    }
    @RequestMapping(value = "/w")
    public List<Weather> allWeather(@RequestParam(defaultValue = "sumy") String city) {
        logger.info(gettingDescription + "all weather API");
        ExecutorService executorService =
                Executors.newFixedThreadPool(numberOfThread);

        ExecutorCompletionService<Weather> completionService
                = new ExecutorCompletionService<>(executorService);
        List<Weather> weatherList = new ArrayList<>();
        for (WeatherAPI temp: list) {
            Future<Weather> submit =
                    completionService.submit(() -> temp.getRequest(city));
            try {
                weatherList.add(submit.get());
            } catch (InterruptedException | ExecutionException e) {
                logger.error(MainController.error, e);
            }
        }
        return weatherList;
    }
}