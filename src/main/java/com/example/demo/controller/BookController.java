package com.example.demo.controller;

import com.example.demo.entity.Book;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class BookController {
    @GetMapping("/books")
    public ModelAndView book() {
        List<Book> bookList = new ArrayList<>();
        bookList.add(new Book(1, "三国演义", "罗贯中"));
        bookList.add(new Book(2, "红楼梦", "曹雪芹"));
        ModelAndView mv = new ModelAndView();
        mv.addObject(bookList);
        mv.setViewName("books");
        return mv;
    }
}
