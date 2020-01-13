package com.example.demo.service;

import com.example.demo.entity.Employee;
import com.example.demo.mapper.EmployeeMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@Service
public class EmployeeService {
    @Resource
    private EmployeeMapper employeeMapper;

    public List<Employee> getEmployeeByPage(Integer page, Integer size, Employee employee, Date[] beginDateScope) {
        if(page != null && size != null) {
            page = (page - 1) * size;
        }
        return employeeMapper.getEmployeeByPage(page, size, employee, beginDateScope);
    }
    public Integer getTotal(Employee employee, Date[] beginDateScope) {
        return employeeMapper.getTotal(employee, beginDateScope);
    }
}
