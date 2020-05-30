package com.example.provider.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {


    @GetMapping(value = "/test")
    public String test() {
        return "使用了eureka的服务提供者";
    }
}
