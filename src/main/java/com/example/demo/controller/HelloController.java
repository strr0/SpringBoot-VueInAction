package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/admin/hello")
    public String admin() {
        return "Hello ADMIN";
    }

    @GetMapping("/user/hello")
    public String user() {
        return "Hello USER";
    }

    @GetMapping("/dba/hello")
    public String dba() {
        return "Hello DBA";
    }
}
