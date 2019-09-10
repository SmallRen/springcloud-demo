package com.example.eureka.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description: java类作用描述
 * @Author: renbaojia
 * @CreateDate: 2019/9/9 18:07
 * @UpdateUser:
 * @UpdateDate: 2019/9/9 18:07
 * @UpdateRemark:
 * @Version: 3.7.1
 */
@RestController
public class HelloWorldController {
    @RequestMapping("/index")
    public String index(){
        return "hello world!";
    }
}
