package com.example.demo;

import com.example.demo.entity.Book;
import com.example.demo.repository.BookRepository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {
    @Autowired
    private BookRepository bookRepository;
    @Autowired
    private MongoTemplate mongoTemplate;

    @Test
    public void contextLoads() {
    }

    @Test
    public void testRepositoryInsert() {
        //Assert.assertNotNull(bookRepository);
        List<Book> books = new ArrayList<>();
        books.add(new Book(1, "朝花夕拾", "鲁迅"));
        books.add(new Book(2, "呐喊", "鲁迅"));
        bookRepository.insert(books);
    }
    @Test
    public void testRepositoryFind() {
        //Assert.assertNotNull(bookRepository);
        List<Book> books = bookRepository.findAllByAuthor("鲁迅");
        System.out.println(books.get(0).getName());
    }

    @Test
    public void testTemplateInsert() {
        Assert.assertNotNull(mongoTemplate);
        List<Book> books = new ArrayList<>();
        books.add(new Book(3, "围城", "钱钟书"));
        books.add(new Book(4, "宋诗选注", "钱钟书"));
        mongoTemplate.insertAll(books);
    }
    @Test
    public void testTemplateFind() {
        Assert.assertNotNull(mongoTemplate);
        List<Book> books = mongoTemplate.findAll(Book.class);
        System.out.println(books.get(3).getName());
    }
}
