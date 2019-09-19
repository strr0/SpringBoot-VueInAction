package com.example.demo.entity;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@ConfigurationProperties(prefix = "my")
public class User {
    private String name;
    private String address;
    private List<String> favorites;

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getAddress() {
        return address;
    }
    public void setFavorites(List<String> favorites) {
        this.favorites = favorites;
    }
    public List<String> getFavorites() {
        return favorites;
    }
}
