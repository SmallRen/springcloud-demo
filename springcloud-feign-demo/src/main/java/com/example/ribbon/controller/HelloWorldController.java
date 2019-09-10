package com.example.ribbon.controller;

import com.example.ribbon.service.DemoService;
import com.example.ribbon.service.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @Autowired
    HelloWorldService service;
    @Autowired
    DemoService demoService;

    @RequestMapping(value = "/welcome")
    public String welcome(@RequestParam String name) {
        return service.welcomeService(name);
    }

    @RequestMapping(value = "/welcome1")
    public String welcome1(@RequestParam String name) {
        return demoService.sayHello(name);
    }
}