package com.example.demo;

import com.example.demo.entity.Book;
import com.example.demo.mapper.BookMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {
    @Resource
    private BookMapper bookMapper;

    @Test
    public void contextLoads() {
        Book book = bookMapper.getBookById(1);
        Assert.assertNotNull(book);
        System.out.println(book.getName());
    }

}
