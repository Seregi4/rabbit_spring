package com.levanov.rabbit_spring;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@EnableRabbit
@Slf4j
public class RabbitMQListener {

    @RabbitListener(queues = "myQueue1")
    public void processMyQueue(String message) {
        log.info("Received first from my queue: {}", message);
    }

    @RabbitListener(queues = "myQueue2")
    public void processMyQueue2(String message) {
        log.info("Received second from my queue: {}", message);
    }
}
