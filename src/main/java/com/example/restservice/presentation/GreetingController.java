package com.example.restservice.presentation;


import com.example.restservice.application.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class GreetingController {

    @Autowired
    private GreetingService greetingService;

    @GetMapping("/formalGreeting")
    public String formalGreeting(@RequestParam(value = "name", defaultValue = "World")String name){
        return greetingService.getFormalGreeting(name);
    }
}