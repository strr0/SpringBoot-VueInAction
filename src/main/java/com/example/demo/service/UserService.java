package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class UserService {
    public String getUserById(int id) {
        System.out.println("get...");
        return "user";
    }
    public void deleteUserById(int id) {
        System.out.println("delete...");
    }
}
