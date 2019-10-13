package com.example.demo.dao;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Repository;

@Repository
public class BookDao {
    @Cacheable(value = "c1")
    public String getBookById(Integer id) {
        System.out.print("getBookById");
        return "这本书是三国演义";
    }

    @CachePut(value = "c1")
    public String updateBookById(Integer id) {
        System.out.print("updateBookById");
        return "这是全新的三国演义";
    }

    @CacheEvict(value = "c1")
    public void deleteBookById(Integer id) {
        System.out.print("deleteBookById");
    }
}
