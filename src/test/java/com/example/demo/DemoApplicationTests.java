package com.example.demo;

import com.example.demo.entity.Book;
import com.example.demo.repository.BookRepository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {
    @Autowired
    private BookRepository bookRepository;

    @Test
    public void contextLoads() {
        List<Book> bookList = bookRepository.findAll();
        Assert.assertNotNull(bookList);
        System.out.println(bookList.get(0).getName());
    }

}
