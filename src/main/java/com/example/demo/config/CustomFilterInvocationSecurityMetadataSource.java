package com.example.demo.config;

import com.example.demo.entity.Menu;
import com.example.demo.entity.Role;
import com.example.demo.mapper.MenuMapper;
import org.springframework.security.access.ConfigAttribute;
import org.springframework.security.access.SecurityConfig;
import org.springframework.security.web.FilterInvocation;
import org.springframework.security.web.access.intercept.FilterInvocationSecurityMetadataSource;
import org.springframework.stereotype.Component;
import org.springframework.util.AntPathMatcher;

import javax.annotation.Resource;
import java.util.Collection;
import java.util.List;

@Component
public class CustomFilterInvocationSecurityMetadataSource implements FilterInvocationSecurityMetadataSource {
    @Resource
    private MenuMapper menuMapper;

    private AntPathMatcher antPathMatcher = new AntPathMatcher();

    @Override
    public Collection<ConfigAttribute> getAttributes(Object object) throws IllegalArgumentException {
        String requestUrl = ((FilterInvocation)object).getRequestUrl();
        List<Menu> allMenus = menuMapper.getAllMenus();
        for(Menu menu : allMenus) {
            if(antPathMatcher.match(menu.getPattern(), requestUrl)) {
                List<Role> roles = menu.getRoles();
                String[] roleArr = new String[roles.size()];
                for(int i = 0; i < roleArr.length; i++) {
                    roleArr[i] = roles.get(i).getName();
                }
                return SecurityConfig.createList(roleArr);
            }
        }
        return SecurityConfig.createList("ROLE_LOGIN");
    }

    @Override
    public Collection<ConfigAttribute> getAllConfigAttributes() {
        return null;
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return FilterInvocation.class.isAssignableFrom(clazz);
    }
}
