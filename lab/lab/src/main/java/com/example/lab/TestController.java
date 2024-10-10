package com.example.lab;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest")
public class TestController {

    @GetMapping("/test")
    public String test() {
        return "Hello, this is a test!";
    }
}