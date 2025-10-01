package com.example.spring_rest_api;

import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import java.time.ZoneId;
import java.time.ZonedDateTime;

@RestController
public class SimpleController {
    
    @GetMapping("/hello")
    
    public Map<String, Object> sayHello() {
        return Map.of(
            "message", "Hello World!",
            "timestamp", System.currentTimeMillis(),
            "koreatime", ZonedDateTime.now(ZoneId.of("Asia/Seoul")).toString()
        );
    }
}
