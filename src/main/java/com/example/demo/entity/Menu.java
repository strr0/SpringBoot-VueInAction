package com.example.demo.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.io.Serializable;
import java.util.List;

public class Menu implements Serializable {
    private Integer id;
    private String url;
    private String path;
    private String component;
    private String name;
    private String iconCls;
    private Boolean keepAlive;
    private Boolean requireAuth;
    private Integer parentId;
    private Boolean enabled;

    private List<Role> roles;
    private List<Menu> children;

    public void setId(Integer id) {
        this.id = id;
    }
    @JsonIgnore
    public Integer getId() {
        return id;
    }
    public void setUrl(String url) {
        this.url = url;
    }
    @JsonIgnore
    public String getUrl() {
        return url;
    }
    public void setPath(String path) {
        this.path = path;
    }
    public String getPath() {
        return path;
    }
    public void setComponent(String component) {
        this.component = component;
    }
    public String getComponent() {
        return component;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setIconCls(String iconCls) {
        this.iconCls = iconCls;
    }
    public String getIconCls() {
        return iconCls;
    }
    public void setKeepAlive(Boolean keepAlive) {
        this.keepAlive = keepAlive;
    }
    public Boolean isKeepAlive() {
        return keepAlive;
    }
    public void setRequireAuth(Boolean requireAuth) {
        this.requireAuth = requireAuth;
    }
    public Boolean isRequireAuth() {
        return requireAuth;
    }
    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }
    @JsonIgnore
    public Integer getParentId() {
        return parentId;
    }
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }
    public Boolean isEnabled() {
        return enabled;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }
    @JsonIgnore
    public List<Role> getRoles() {
        return roles;
    }
    public void setChildren(List<Menu> children) {
        this.children = children;
    }
    public List<Menu> getChildren() {
        return children;
    }
}
