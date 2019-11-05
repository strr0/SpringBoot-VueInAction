package com.example.demo.service;

import org.springframework.security.access.annotation.Secured;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Service;

@Service
public class MethodService {
    //@Secured("ROLE_admin")
    public String admin() {
        return "Hello ADMIN";
    }

    //@PreAuthorize("hasRole('admin') and hasRole('dba')")
    public String dba() {
        return "Hello DBA";
    }

    //@PreAuthorize("hasAnyRole('admin', 'dba', 'user')")
    public String user() {
        return "Hello USER";
    }
}
