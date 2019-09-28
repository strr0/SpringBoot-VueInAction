package com.example.demo.service;

import com.example.demo.entity.Book;
import com.example.demo.mapper.BookMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class BookService {
    @Resource
    private BookMapper bookMapper;

    public int addBook(Book book) {
        return bookMapper.addBook(book);
    }
    public int updateBook(Book book) {
        return bookMapper.updateBook(book);
    }
    public int deleteBook(Integer id) {
        return bookMapper.deleteBook(id);
    }
    public Book getBookById(Integer id) {
        return bookMapper.getBookById(id);
    }
    public List<Book> getAllBooks() {
        return bookMapper.getAllBooks();
    }
}
