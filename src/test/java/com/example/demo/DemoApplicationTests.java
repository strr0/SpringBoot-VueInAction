package com.example.demo;

import com.example.demo.dao.BookDao;
import com.example.demo.entity.Book;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {
    @Autowired
    private BookDao bookDao;

    @Test
    public void contextLoads() {
        System.out.print("第一次get: ");
        bookDao.getBookById(1);
        System.out.println();

        System.out.print("第二次get: ");
        bookDao.getBookById(1);
        System.out.println();

        System.out.print("delete: ");
        bookDao.deleteBookById(1);
        System.out.println();

        System.out.print("update: ");
        bookDao.updateBookById(new Book(1, "三国演义", "罗贯中"));
        System.out.println();

        System.out.print("第三次get: ");
        bookDao.getBookById(1);
        System.out.println();
    }

}
