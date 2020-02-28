package com.netcracker.weather.demo;


import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.netcracker.weather")
public class WeatherReporterApplication {
	private final static Logger logger = Logger.getLogger(WeatherReporterApplication.class);
	public static void main(String[] args) {
		logger.info("Starting weather API");
		SpringApplication.run(WeatherReporterApplication.class, args);
	}

}
