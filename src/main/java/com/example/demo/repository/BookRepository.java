package com.example.demo.repository;

import com.example.demo.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookRepository extends JpaRepository<Book, Integer> {
    void deleteById(Integer id);
    Book findOneById(Integer id);
    List<Book> findAll();
}
