package com.netcracker.weather.config;

import com.netcracker.weather.model.service.convertor.*;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.http.MediaType;
import org.springframework.web.servlet.config.annotation.ContentNegotiationConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
@EnableWebMvc
public class WebConfig
        implements WebMvcConfigurer {
    @Override
    public void configureContentNegotiation(
                    ContentNegotiationConfigurer configurer) {
        configurer.favorPathExtension(true).
                favorParameter(false).
                ignoreAcceptHeader(true).
                defaultContentType(MediaType.APPLICATION_XML).
                mediaType("json", MediaType.APPLICATION_JSON).
                mediaType("xml", MediaType.APPLICATION_XML);
    }
    @Override
    public void addFormatters(FormatterRegistry registry) {
        registry.addConverter(new WeatherStackPOJOToWeather());
        registry.addConverter(new OpenWeatherPOJOToWeather());
        registry.addConverter(new DarkSkyPOJOToWeather());
        registry.addConverter(new WeatherBitPOJOToWeather());

        registry.addConverter(new JsonToWeatherStackPOJO());
        registry.addConverter(new JsonToOpenWeatherPOJO());
        registry.addConverter(new JsonToDarkSkyPOJO());
        registry.addConverter(new JsonToWeatherBitPOJO());
    }
}
