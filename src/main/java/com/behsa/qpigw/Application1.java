package com.behsa.qpigw;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class Application1 implements CommandLineRunner {
    public static void main(String[] args) {
        SpringApplication springApplication =
                new SpringApplicationBuilder()
                        .sources(Application1.class)
                        .web(WebApplicationType.NONE)
                        .build();

        springApplication.run(args);
    }

    @Override
    public void run(String... args) throws Exception {

    }
}
