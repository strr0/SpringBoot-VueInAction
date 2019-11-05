package com.example.demo.entity;

public class MenuRole {
    private Integer id;
    private Integer mid;
    private Integer rid;

    public MenuRole() {}
    public MenuRole(Integer mid, Integer rid) {
        this.mid = mid;
        this.rid = rid;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    public Integer getId() {
        return id;
    }
    public void setMid(Integer mid) {
        this.mid = mid;
    }
    public Integer getMid() {
        return mid;
    }
    public void setRid(Integer rid) {
        this.rid = rid;
    }
    public Integer getRid() {
        return rid;
    }
}
