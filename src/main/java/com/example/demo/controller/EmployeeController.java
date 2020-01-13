package com.example.demo.controller;

import com.example.demo.entity.Employee;
import com.example.demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/employee/basic")
    public Map<String, Object> getEmployeeByPage(@RequestParam(defaultValue = "1") Integer page,
                                                 @RequestParam(defaultValue = "10") Integer size,
                                                 Employee employee, Date[] beginDateScope) {
        Map<String, Object> map = new HashMap<>();
        List<Employee> employeeByPage = employeeService.getEmployeeByPage(page, size, employee, beginDateScope);
        Integer total = employeeService.getTotal(employee, beginDateScope);
        map.put("emps", employeeByPage);
        map.put("total", total);
        return map;
    }
}
