package com.example.demo.dao;

import com.example.demo.entity.Book;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Repository;

@Repository
@CacheConfig(cacheNames = "book_cache")
public class BookDao {
    @Cacheable
    public Book getBookById(Integer id) {
        System.out.print("getBookById");
        return new Book(1, "三国演义", "罗贯中");
    }

    @CachePut(key = "#book.id")
    public Book updateBookById(Book book) {
        System.out.print("updateBookById");
        book.setName("三国演义-修改");
        return book;
    }

    @CacheEvict(key = "#id")
    public void deleteBookById(Integer id) {
        System.out.print("deleteBookById");
    }
}
