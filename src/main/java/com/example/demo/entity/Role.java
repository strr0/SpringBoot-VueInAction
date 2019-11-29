package com.example.demo.entity;

public class Role {
    private Integer id;
    private String name;
    private String nameZh;

    public void setId(Integer id) {
        this.id = id;
    }
    public Integer getId() {
        return id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setNameZh(String nameZh) {
        this.nameZh = nameZh;
    }
    public String getNameZh() {
        return nameZh;
    }
}
