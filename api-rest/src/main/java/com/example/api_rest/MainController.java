package com.example.api_rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

@RestController
public class MainController {

    @GetMapping("/")
    public Map<String, String> getInfo() {
        Map<String, String> response = new HashMap<>();
        response.put("name", "Votre nom");
        response.put("email", "votreMail@campus-eni.fr");
        response.put("date", LocalDate.now().toString());
        return response;
    }
}
