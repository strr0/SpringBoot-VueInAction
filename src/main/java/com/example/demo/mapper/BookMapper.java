package com.example.demo.mapper;

import com.example.demo.entity.Book;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BookMapper {
    int addBook(Book book);
    int updateBook(Book book);
    int deleteBook(Integer id);
    Book getBookById(Integer id);
    List<Book> getAllBooks();
}
