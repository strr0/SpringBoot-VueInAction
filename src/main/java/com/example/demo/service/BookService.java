package com.example.demo.service;

import com.example.demo.entity.Book;
import com.example.demo.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    @Autowired
    private BookRepository bookRepository;

    public void addBook(Book book) {
        bookRepository.save(book);
    }
    public void deleteBook(Integer id) {
        bookRepository.deleteById(id);
    }
    public Book getBookById(Integer id) {
        return bookRepository.findOneById(id);
    }
    public List<Book> getBooks() {
        return bookRepository.findAll();
    }
}
