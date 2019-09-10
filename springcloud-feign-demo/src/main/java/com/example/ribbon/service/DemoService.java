package com.example.ribbon.service;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

// value指定服务名   fallback指定失败回调类
@FeignClient(value = "client", fallback = DemoServiceFallback.class)
public interface DemoService {
    @RequestMapping(value = "/index",method = RequestMethod.GET)
        // 需要注意的是，@RequestParam注解的value是必须的
    String sayHello(@RequestParam(value = "name") String name);
}

