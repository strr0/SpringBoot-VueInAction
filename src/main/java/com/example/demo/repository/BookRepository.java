package com.example.demo.repository;

import com.example.demo.entity.Book;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface BookRepository extends MongoRepository<Book, Integer> {
    List<Book> findAllByAuthor(String author);
    Book findByName(String name);
}
