package com.example.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

/**
 * eureka server 服务器端启动类，接受其他服务注册进来
 */
@EnableEurekaServer
@SpringBootApplication
@EnableWebSecurity
public class SpringCloudEurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudEurekaServerApplication.class, args);
    }

}
