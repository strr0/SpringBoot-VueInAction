package com.example.demo.controller;

import com.example.demo.entity.Book;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class BookController {
    @GetMapping("/book")
    public Book book() {
        Book book = new Book("三国演义", "罗贯中", 30f, new Date());
        return book;
    }
}
