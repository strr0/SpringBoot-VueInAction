package com.example.demo.controller;

import com.example.demo.service.MethodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Autowired
    private MethodService service;

    @GetMapping("/admin/hello")
    public String admin() {
        return service.admin();
    }

    @GetMapping("/user/hello")
    public String user() {
        return service.user();
    }

    @GetMapping("/db/hello")
    public String dba() {
        return service.dba();
    }
}
