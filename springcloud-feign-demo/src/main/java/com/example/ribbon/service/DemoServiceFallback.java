package com.example.ribbon.service;

import org.springframework.stereotype.Component;



// fallback
@Component
public class DemoServiceFallback implements DemoService {
    @Override
    public String sayHello(String name) {
        return "feign failed!";
    }
}
