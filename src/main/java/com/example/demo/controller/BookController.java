package com.example.demo.controller;

import com.example.demo.entity.Book;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
@RequestMapping("/book")
public class BookController {
    @GetMapping("/")
    public Book book() {
        Book book = new Book("三国演义", "罗贯中", 30f, new Date());
        return book;
    }

    @PostMapping("/")
    public String addBook(String name) {
        return "receive:" + name;
    }
    @DeleteMapping("/{id}")
    public String deleteBookById(@PathVariable Long id) {
        return String.valueOf(id);
    }
}
