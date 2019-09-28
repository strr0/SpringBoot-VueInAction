package com.example.demo.controller;

import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserService service;

    @GetMapping("/getUserById")
    public String getUserById(int id) {
        return service.getUserById(id);
    }

    @GetMapping("/deleteUserById")
    public void deleteUserById(int id) {
        service.deleteUserById(id);
    }
}
