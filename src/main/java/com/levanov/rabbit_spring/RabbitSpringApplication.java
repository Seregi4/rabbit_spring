package com.levanov.rabbit_spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

@Import(RabbitConfiguration.class)
@SpringBootApplication
public class RabbitSpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(RabbitSpringApplication.class, args);
    }

}
