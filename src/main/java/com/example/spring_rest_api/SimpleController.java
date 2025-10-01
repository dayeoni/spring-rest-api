package com.example.spring_rest_api;

import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class SimpleController {
    
    @GetMapping("/hello")
    
    public Map<String, Object> sayHello() {
        return Map.of(
            "message", "Hello World!",
            "timestamp", "",
            "koreatime",""
        );
    }
}
