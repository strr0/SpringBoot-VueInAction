package com.example.demo.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.security.authentication.*;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

@Component
public class CustomFailureHandler implements AuthenticationFailureHandler {
    @Override
    public void onAuthenticationFailure(HttpServletRequest request, HttpServletResponse response, AuthenticationException exception) throws IOException, ServletException {
        response.setStatus(401);
        response.setContentType("application/json;charset=UTF-8");
        PrintWriter out = response.getWriter();
        Map<String, Object> map = new HashMap<>();
        map.put("status", 401);
        if(exception instanceof BadCredentialsException ||
                exception instanceof UsernameNotFoundException) {
            map.put("msg", "账户名或密码输入错误");
        }
        else if(exception instanceof LockedException) {
            map.put("msg", "账户被锁定，请联系管理员");
        }
        else if(exception instanceof AccountExpiredException) {
            map.put("msg", "账户已过期，请联系管理员");
        }
        else if(exception instanceof CredentialsExpiredException) {
            map.put("msg", "密码已过期，请联系管理员");
        }
        else if(exception instanceof DisabledException) {
            map.put("msg", "账户被禁用，请联系管理员");
        }
        else{
            map.put("msg", "登陆失败");
        }
        out.write(new ObjectMapper().writeValueAsString(map));
        out.flush();
        out.close();
    }
}
