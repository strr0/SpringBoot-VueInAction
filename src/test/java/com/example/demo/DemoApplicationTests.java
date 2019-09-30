package com.example.demo;

import com.example.demo.entity.Book;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {
    @Autowired
    private RedisTemplate redisTemplate;

    @Test
    public void addBookTest() {
        ValueOperations ops = redisTemplate.opsForValue();
        Book book = new Book(1, "三国演义", "罗贯中");
        ops.set("book", book);
    }

    @Test
    public void getBookTest() {
        ValueOperations ops = redisTemplate.opsForValue();
        Book book = (Book) ops.get("book");
        Assert.assertNotNull(book);
        System.out.println(book.getName());
    }

}
