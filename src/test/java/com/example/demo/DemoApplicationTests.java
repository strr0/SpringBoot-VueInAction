package com.example.demo;

import com.example.demo.entity.Book;
import com.example.demo.service.BookService;
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
    BookService bookService;

    @Test
    public void contextLoads() {
        List<Book> bookList = bookService.getAllBooks();
        Assert.assertNotNull(bookList);
        for (Book book : bookList) {
            System.out.println(book.getName());
        }
    }

    @Test
    public void testAddBook() {
        int result = bookService.addBook(new Book(null, "西厢记", "王实甫"));
        System.out.println(result);
    }

    @Test
    public void testDeleteBook() {
        int result = bookService.deleteBook(3);
        System.out.println(result);
    }

}
