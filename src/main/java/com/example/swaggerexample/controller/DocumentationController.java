package com.example.swaggerexample.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DocumentationController {

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello, Swagger!";
    }
}
