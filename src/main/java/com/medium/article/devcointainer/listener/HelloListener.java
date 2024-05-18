package com.medium.article.devcointainer.listener;


import org.springframework.stereotype.Component;

@Component
public class HelloListener {
    public void receiveMessage(String message) {
        System.out.println("Received <" + message + ">");
    }
}

