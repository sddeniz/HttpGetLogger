package com.behsa.qpigw;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.behsa.apigw")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
