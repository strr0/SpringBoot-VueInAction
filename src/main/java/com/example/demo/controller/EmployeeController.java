package com.example.demo.controller;

import com.example.demo.entity.*;
import com.example.demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/employee/basic")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/")
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

    @GetMapping("/maxWorkId")
    public Integer getMaxWorkId() {
        return employeeService.getMaxWorkId();
    }

    @PostMapping("/")
    public Integer addEmployee(@RequestBody Employee employee) {
        return employeeService.addEmployee(employee);
    }
    @PutMapping("/")
    public Integer editEmployee(@RequestBody Employee employee) {
        return employeeService.editEmployee(employee);
    }
    @DeleteMapping("/{id}")
    public Integer deleteEmployee(@PathVariable Integer id) {
        return employeeService.deleteEmployee(id);
    }

    @GetMapping("/politics")
    public List<Politic> getAllPolitics() {
        return employeeService.getAllPolitics();
    }

    @GetMapping("/nations")
    public List<Nation> getAllNations() {
        return employeeService.getAllNations();
    }

    @GetMapping("/positions")
    public List<Position> getAllPositions() {
        return employeeService.getAllPositions();
    }

    @GetMapping("/jobLevels")
    public List<JobLevel> getAllJobLevels() {
        return employeeService.getAllJobLevels();
    }

    @GetMapping("/departments")
    public List<Department> getAllDepartments() {
        return employeeService.getAllDepartments();
    }
}
