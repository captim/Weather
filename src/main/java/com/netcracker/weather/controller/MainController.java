package com.netcracker.weather.controller;

import com.netcracker.weather.model.Weather;
import com.netcracker.weather.model.service.WeatherAPI;
import org.apache.log4j.Logger;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.openxml4j.opc.OPCPackage;
import org.apache.poi.util.IOUtils;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

@RestController
public class MainController {
    final static Logger logger = Logger.getLogger(MainController.class);
    private final List<WeatherAPI> list;
    private final WeatherAPI weatherStack;
    private final WeatherAPI openWeatherMap;
    private final WeatherAPI darkSky;
    private final WeatherAPI weatherBit;
    private static String gettingDescription = "Getting weather description from ";
    public static String gettingRequest = "Getting request from ";
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
            throws IOException, InvalidFormatException {
        logger.info(gettingDescription + weatherStack.getId());
        XWPFDocument document = new XWPFDocument(OPCPackage.open("template.docx"));
        for (XWPFParagraph paragraph : document.getParagraphs()) {
            for (XWPFRun run : paragraph.getRuns()) {
                String text = run.getText(0);
                text = text.replace("WEATHERAPI", "John");
                run.setText(text,0);
                System.out.println(text);
            }
        }
        return weatherStack.getRequest(city);
    }
    @RequestMapping(value = "/get-doc",method = RequestMethod.GET, produces="application/vnd.openxmlformats-officedocument.wordprocessingml.document")
    public byte[] getDoc() throws IOException {
        File file = new File("template.docx");
        FileInputStream fis = new FileInputStream(file);
        byte[] doc = IOUtils.toByteArray(fis);
        return doc;
    }
    @RequestMapping(value = "/w2")
    public Weather openWeather(@RequestParam(defaultValue = "sumy") String city)
            throws IOException {
        logger.info(gettingDescription + openWeatherMap.getId());
        return openWeatherMap.getRequest(city);
    }
    @RequestMapping(value = "/w3")
    public Weather darkSky(@RequestParam(defaultValue = "sumy") String city)
            throws IOException {
        logger.info(gettingDescription + darkSky.getId());
        return darkSky.getRequest(city);
    }
    @RequestMapping(value = "/w4")
    public Weather weatherBit(@RequestParam(defaultValue = "sumy") String city)
            throws IOException {
        logger.info(gettingDescription + weatherBit.getId());
        return weatherBit.getRequest(city);
    }
    @RequestMapping(value = "/w")
    public List<Weather> allWeather(@RequestParam(defaultValue = "sumy")
                                                String city)
            throws ExecutionException, InterruptedException {
        logger.info(gettingDescription + "all weather API");
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