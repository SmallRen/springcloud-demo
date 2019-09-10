package com.example.eureka.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class HelloWorldController {
    @RequestMapping("/index")
    public String index(String name) {
        return "hello world! 我是客户端2。"+name;
    }
}
