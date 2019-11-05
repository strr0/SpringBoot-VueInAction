package com.example.demo.entity;

public class UserRole {
    private Integer id;
    private Integer uid;
    private Integer rid;

    public UserRole() {}
    public UserRole(Integer uid, Integer rid) {
        this.uid = uid;
        this.rid = rid;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    public Integer getId() {
        return id;
    }
    public void setUid(Integer uid) {
        this.uid = uid;
    }
    public Integer getUid() {
        return uid;
    }
    public void setRid(Integer rid) {
        this.rid = rid;
    }
    public Integer getRid() {
        return rid;
    }
}
