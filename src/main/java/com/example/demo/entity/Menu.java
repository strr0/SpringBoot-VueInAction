package com.example.demo.entity;

import java.util.List;

public class Menu {
    private Integer id;
    private String pattern;

    private List<Role> roles;

    public Menu() {}
    public Menu(String pattern) {
        this.pattern = pattern;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    public Integer getId() {
        return id;
    }
    public void setPattern(String pattern) {
        this.pattern = pattern;
    }
    public String getPattern() {
        return pattern;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }
    public List<Role> getRoles() {
        return roles;
    }
}
