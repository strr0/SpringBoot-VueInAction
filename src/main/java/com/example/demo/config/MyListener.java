package com.example.demo.config;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class MyListener implements ServletRequestListener {
    @Override
    public void requestInitialized(ServletRequestEvent sre) {
        System.out.println("MyListener>>>init");
    }

    @Override
    public void requestDestroyed(ServletRequestEvent sre) {
        System.out.println("MyListener>>>destroy");
    }
}
