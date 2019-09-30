package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {
    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @GetMapping("/books")
    public String book() {
        ValueOperations<String, String> ops = stringRedisTemplate.opsForValue();
        //ops.set("name", "三国演义");
        String name = ops.get("name");
        System.out.println(name);
        return "ok";
    }
}
