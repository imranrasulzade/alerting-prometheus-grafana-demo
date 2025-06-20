package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class DemoController {

    @GetMapping("/success")
    public String success(@RequestParam String name) {
        return "Hello, " + name;
    }

    @GetMapping("/error")
    public String error(@RequestParam(required = false) String param) {
        if (param == null || param.isBlank()) {
            throw new RuntimeException("Param is missing!");
        }
        return "Param: " + param;
    }
}