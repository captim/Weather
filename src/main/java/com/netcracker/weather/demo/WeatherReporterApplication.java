package com.netcracker.weather.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.netcracker.weather")
public class WeatherReporterApplication {

	public static void main(String[] args) {
		SpringApplication.run(WeatherReporterApplication.class, args);
	}

}
