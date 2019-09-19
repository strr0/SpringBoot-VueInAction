package com.example.demo.controller;

import com.example.demo.entity.Book;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {
    @GetMapping("/book")
    public Book book() {
        Book book = new Book(1, "三国演义", "罗贯中");
        return book;
    }
}
