package com.example.demo.entity;

import java.io.Serializable;
import java.util.Date;

public class Message implements Serializable {
    private String content;
    private Date date;

    public Message() {}
    public Message(String content, Date date) {
        this.content = content;
        this.date = date;
    }

    public void setContent(String content) {
        this.content = content;
    }
    public String getContent() {
        return content;
    }
    public void setDate(Date date) {
        this.date = date;
    }
    public Date getDate() {
        return date;
    }
}
