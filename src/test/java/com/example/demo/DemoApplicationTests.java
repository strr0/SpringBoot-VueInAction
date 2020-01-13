package com.example.demo;

import com.example.demo.entity.Employee;
import com.example.demo.entity.Menu;
import com.example.demo.entity.Role;
import com.example.demo.entity.User;
import com.example.demo.mapper.EmployeeMapper;
import com.example.demo.mapper.MenuMapper;
import com.example.demo.mapper.UserMapper;
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
    private MenuMapper menuMapper;
    @Resource
    private EmployeeMapper employeeMapper;

    @Test
    public void addUserTest() {
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        String adminpwd = encoder.encode("password");
        String userpwd = encoder.encode("123456");
        userMapper.addUser(new User("管理员", "17766777766", "0591-88778877", "福建泉州",
                true, "admin", adminpwd, "16252_100.png", null));
        userMapper.addUser(new User("张三", "13066777766", "0591-88777766", "福建福州",
                true, "zhangsan", userpwd, "16253_100.png", null));
        userMapper.addUser(new User("李四", "15055444455", "0592-88999988", "福建厦门",
                true, "lisi", userpwd, "16254_100.png", null));
        userMapper.addUser(new User("王五", "18087654321", "0593-87654321", "福建莆田",
                true, "wangwu", userpwd, "16255_100.png", null));
    }

    @Test
    public void getMenuTest() {
        List<Menu> menus = menuMapper.getAllMenus();
        for(Menu menu : menus) {
            if(menu.getId() == 11) {
                System.out.println(menu.getName());
                List<Role> roles = menu.getRoles();
                for(Role role : roles) {
                    System.out.println(role.getName());
                }
            }
        }
    }

    @Test
    public void getUserByUsernameTest() {
        User user = userMapper.getUserByUsername("zhangsan");
        System.out.println(user.isEnabled());
        List<Role> roles = user.getRoles();
        for(Role role : roles) {
            System.out.println(role.getName());
        }
    }

    @Test
    public void getMenusDetailTest() {
        List<Menu> menus = menuMapper.getMenusByUserId(1);
        System.out.println(menus.size());
    }

    @Test
    public void getEmployeeTest() {
        //Employee employee = employeeMapper.getEmployeeById(2);
        //System.out.println(employee.getDepartmentName());
        Employee employee = new Employee();
        employee.setDepartmentId(6);
        employee.setJobLevelId(3);
        employee.setPosId(5);
        List<Employee> employees = employeeMapper.getEmployeeByPage(null, null, employee, null);
        System.out.println("size: " + employees.size());
        System.out.println("name: " + employees.get(0).getName());
    }

}
