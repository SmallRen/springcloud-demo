package com.example.ribbon.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HelloWorldService {
    @Autowired
    RestTemplate restTemplate;
    @HystrixCommand(fallbackMethod = "error")
    public String welcomeService(String name) {
        return restTemplate.getForObject("http://client/index?name="+name,String.class);
    }

    public String error(String name) {
        return "哎呀呀，"+name+",出错了呀!";
    }
}
