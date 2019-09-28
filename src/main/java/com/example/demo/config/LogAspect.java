package com.example.demo.config;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LogAspect {
    @Pointcut("execution(* com.example.demo.service.*.*(..))")
    public void pc() {}

    @Before("pc()")
    public void before(JoinPoint jp) {
        String name = jp.getSignature().getName();
        System.out.println(name + "方法开始执行...");
    }
    @After("pc()")
    public void after(JoinPoint jp) {
        String name = jp.getSignature().getName();
        System.out.println(name + "方法执行结束...");
    }
    @AfterReturning(value = "pc()", returning = "result")
    public void afterReturning(JoinPoint jp, Object result) {
        String name = jp.getSignature().getName();
        System.out.println(name + "方法返回值: " + result);
    }
    @AfterThrowing(value = "pc()", throwing = "e")
    public void afterThrowing(JoinPoint jp, Exception e) {
        String name = jp.getSignature().getName();
        System.out.println(name + "方法抛出异常: " + e.getMessage());
    }
}
