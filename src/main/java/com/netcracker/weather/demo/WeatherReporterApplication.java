package com.netcracker.weather.demo;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.apache.log4j.Logger;
import java.io.IOException;

@SpringBootApplication
@ComponentScan(basePackages = "com.netcracker.weather")
public class WeatherReporterApplication {
	final static Logger logger = Logger.getLogger(WeatherReporterApplication.class);
	public static void main(String[] args) throws IOException {
		logger.info("Starting weather API");
		SpringApplication.run(WeatherReporterApplication.class, args);
	}

}
