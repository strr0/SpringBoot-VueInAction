package com.example.demo.controller;

import com.example.demo.entity.User;
import org.springframework.validation.Errors;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {
    @PostMapping("/user")
    public List<String> addUser(@Validated User user, Errors errors) {
        List<String> result = new ArrayList<>();
        if(errors.hasErrors()) {
            List<ObjectError> allErrors = errors.getAllErrors();
            for(ObjectError error : allErrors) {
                result.add(error.getDefaultMessage());
            }
        }
        return result;
    }
}
