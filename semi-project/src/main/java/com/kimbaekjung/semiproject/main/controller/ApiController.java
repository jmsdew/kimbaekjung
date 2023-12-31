package com.kimbaekjung.semiproject.main.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ApiController {

    @Value("${API-KEY.javascript-key}")
    private String javascriptKey;

    @GetMapping("/key")
    public String getJavaScriptKey() {
        return javascriptKey;
    }
}