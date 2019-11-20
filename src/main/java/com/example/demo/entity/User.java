package com.example.demo.entity;

public class User {
    private String username;
    private String gender;

    public User() {}
    public User(String username, String gender) {
        this.username = username;
        this.gender = gender;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    public String getUsername() {
        return username;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public String getGender() {
        return gender;
    }
}
