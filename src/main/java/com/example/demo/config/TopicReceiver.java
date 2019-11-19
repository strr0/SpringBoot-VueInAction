package com.example.demo.config;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class TopicReceiver {
    @RabbitListener(queues = "phone")
    public void handler1(String msg) {
        System.out.println("PhoneReceiver: " + msg);
    }

    @RabbitListener(queues = "xiaomi")
    public void handler2(String msg) {
        System.out.println("XiaoMiReceiver: " + msg);
    }

    @RabbitListener(queues = "huawei")
    public void handler3(String msg) {
        System.out.println("HuaWeiReceiver: " + msg);
    }
}
