package com.example.config.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RefreshScope
@RestController
@SpringBootApplication
public class SpringCloudConfigClientDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudConfigClientDemoApplication.class, args);
    }

    @Value("${username}")
    String username;
    @Value("${password}")
    String password;

    @RequestMapping(value = "/user")
    public String user() {
        return "您好，您用户名为：" + username + ",密码为：" + password;
    }
}
