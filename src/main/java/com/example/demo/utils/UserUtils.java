package com.example.demo.utils;

import com.example.demo.entity.User;
import org.springframework.security.core.context.SecurityContextHolder;

public class UserUtils {
    public static User getCurrentUser() {
        return (User)SecurityContextHolder.getContext().getAuthentication().getPrincipal();
    }
}
