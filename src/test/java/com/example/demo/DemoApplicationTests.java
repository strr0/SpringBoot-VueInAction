package com.example.demo;

import com.example.demo.entity.*;
import com.example.demo.mapper.*;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {
    @Resource
    private UserMapper userMapper;
    @Resource
    private RoleMapper roleMapper;
    @Resource
    private UserRoleMapper userRoleMapper;
    @Resource
    private MenuMapper menuMapper;
    @Resource
    private MenuRoleMapper menuRoleMapper;

    @Test
    public void addUserTest() {
        //Assert.assertNotNull(userMapper);
        String password = new BCryptPasswordEncoder().encode("123456");
        userMapper.insertUser(new User("root", password, true, false));
        userMapper.insertUser(new User("admin", password, true, false));
        userMapper.insertUser(new User("strr", password, true, false));
    }

    @Test
    public void addRoleTest() {
        roleMapper.insertRole(new Role("ROLE_dba", "数据库管理员"));
        roleMapper.insertRole(new Role("ROLE_admin", "系统管理员"));
        roleMapper.insertRole(new Role("ROLE_user", "普通用户"));
    }

    @Test
    public void addUserRoleTest() {
        userRoleMapper.insertUserRole(new UserRole(1, 1));
        userRoleMapper.insertUserRole(new UserRole(1, 2));
        userRoleMapper.insertUserRole(new UserRole(2, 2));
        userRoleMapper.insertUserRole(new UserRole(3, 3));
    }

    @Test
    public void addMenuTest() {
        menuMapper.insertMenu(new Menu("/db/**"));
        menuMapper.insertMenu(new Menu("/admin/**"));
        menuMapper.insertMenu(new Menu("/user/**"));
    }

    @Test
    public void addMenuRoleTest() {
        menuRoleMapper.insertMenuRole(new MenuRole(1, 1));
        menuRoleMapper.insertMenuRole(new MenuRole(2, 2));
        menuRoleMapper.insertMenuRole(new MenuRole(3, 3));
    }

    @Test
    public void findUserTest() {
        User user = userMapper.findUserByUsername("root");
        //Assert.assertNotNull(user);
        List<Role> roles = userMapper.findUserRoleByUid(user.getId());
        Assert.assertNotNull(roles);
        for(Role role : roles) {
            System.out.println(role.getName());
        }
    }

    @Test
    public void getAllMenusTest() {
        List<Menu> menus = menuMapper.getAllMenus();
        //Assert.assertNotNull(menus);
        for(Menu menu : menus) {
            List<Role> roles = menu.getRoles();
            System.out.println(menu.getPattern());
            for(Role role : roles) {
                System.out.println(role.getName());
            }
        }
    }

    @Test
    public void testContext() {}

}
