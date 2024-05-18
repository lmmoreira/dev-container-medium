package com.medium.article.devcointainer.controller;

import com.medium.article.devcointainer.config.RabbitConfig;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @GetMapping("/hello")
    public String sayHello() {
        return "oi!";
    }

    @GetMapping("/hello-redis")
    @Cacheable(value = "helloController")
    public String sayHelloToRedis() {
        return "oi redis!";
    }

    @GetMapping("/hello-rabbit")
    public String sayHelloToRabbit(@RequestParam String message) {
        rabbitTemplate.convertAndSend(RabbitConfig.topicExchangeName, RabbitConfig.rountingKey, message);
        return "Message sent: " + message;
    }
}
