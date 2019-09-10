package com.example.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class SprinCloudEurekaClientDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SprinCloudEurekaClientDemoApplication.class, args);
    }

}
