package com.example.restservice.application;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class GreetingService {


    public static final Logger log = LoggerFactory.getLogger(GreetingService.class);

    @Autowired
    private RestTemplate restTemplate;


    public String getFormalGreeting(String name) {
        String url = "http://localhost:8080/greeting?name="+name;
        return this.restTemplate.getForObject(url, String.class) + "Welcome Back.";
    }
}
