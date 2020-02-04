package com.example.demo.entity;

import java.util.Date;

public class JobLevel {
    private Integer id;
    private String name;
    private String titleLevel;
    private Date createDate;
    private Boolean enabled;

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
    public void setTitleLevel(String titleLevel) {
        this.titleLevel = titleLevel;
    }
    public String getTitleLevel() {
        return titleLevel;
    }
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
    public Date getCreateDate() {
        return createDate;
    }
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }
    public Boolean getEnabled() {
        return enabled;
    }
}
