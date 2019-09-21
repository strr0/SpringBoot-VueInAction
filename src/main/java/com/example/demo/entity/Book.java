package com.example.demo.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.Date;

public class Book {
    private String name;
    private String author;
    @JsonIgnore
    private Float price;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date publicationDate;

    public Book() {}
    public Book(String name, String author, Float price, Date publicationDate) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.publicationDate = publicationDate;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public String getAuthor() {
        return author;
    }
    public void setPrice(Float price) {
        this.price = price;
    }
    public Float getPrice() {
        return price;
    }
    public void setPublicationDate(Date publicationDate) {
        this.publicationDate = publicationDate;
    }
    public Date getPublicationDate() {
        return publicationDate;
    }
}
