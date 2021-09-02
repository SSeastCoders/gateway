package com.ss.eastcoderbank.gateway.config;

import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.context.annotation.Configuration;


@EnableWebMvc
@Configuration
public class CorsConfiguration implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("*")
            .allowedOrigins("http://localhost:4222","http://localhost:4200", "http://localhost:3600", "http://localhost:36???")
            .allowedMethods("PUT", "DELETE", "GET", "PATCH", "POST")
            .allowedHeaders("*")
            .exposedHeaders("Authorization", "id");
    }
}

