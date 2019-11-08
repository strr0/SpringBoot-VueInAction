package com.example.demo.controller;

import com.example.demo.entity.Chat;
import com.example.demo.entity.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;

import java.security.Principal;

@Controller
public class GreetingController {
    @Autowired
    private SimpMessagingTemplate messagingTemplate;

    @MessageMapping("/hello")
    public void greeting(Message message) {
        messagingTemplate.convertAndSend("/topic/greetings", message);
    }

    @MessageMapping("/chat")
    public void chat(Principal principal, Chat chat) {
        String from = principal.getName();
        chat.setFrom(from);
        messagingTemplate.convertAndSendToUser(chat.getTo(), "/queue/chat", chat);
    }
}
