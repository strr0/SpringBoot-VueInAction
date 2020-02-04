package com.example.demo.entity;

public class Department {
    private Integer id;
    private String name;
    private Integer parentId;
    private String depPath;
    private Boolean enabled;
    private Boolean isParent;

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
    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }
    public Integer getParentId() {
        return parentId;
    }
    public void setDepPath(String depPath) {
        this.depPath = depPath;
    }
    public String getDepPath() {
        return depPath;
    }
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }
    public Boolean getEnabled() {
        return enabled;
    }

    public void setParent(Boolean parent) {
        isParent = parent;
    }

    public Boolean getParent() {
        return isParent;
    }
}
