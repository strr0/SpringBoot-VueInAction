package com.example.demo.service;

import com.example.demo.entity.*;
import com.example.demo.mapper.*;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@Service
public class EmployeeService {
    @Resource
    private EmployeeMapper employeeMapper;
    @Resource
    private PoliticMapper politicMapper;
    @Resource
    private NationMapper nationMapper;
    @Resource
    private PositionMapper positionMapper;
    @Resource
    private JobLevelMapper jobLevelMapper;
    @Resource
    private DepartmentMapper departmentMapper;

    public List<Employee> getEmployeeByPage(Integer page, Integer size, Employee employee, Date[] beginDateScope) {
        if(page != null && size != null) {
            page = (page - 1) * size;
        }
        return employeeMapper.getEmployeeByPage(page, size, employee, beginDateScope);
    }
    public Integer getTotal(Employee employee, Date[] beginDateScope) {
        return employeeMapper.getTotal(employee, beginDateScope);
    }
    public Integer getMaxWorkId() {
        return employeeMapper.getMaxWorkId();
    }

    public Integer addEmployee(Employee employee) {
        return employeeMapper.addEmployee(employee);
    }
    public Integer editEmployee(Employee employee) {
        return employeeMapper.editEmployee(employee);
    }
    public Integer deleteEmployee(Integer id) {
        return employeeMapper.deleteEmployee(id);
    }

    public List<Politic> getAllPolitics() {
        return politicMapper.getAllPolitics();
    }
    public List<Nation> getAllNations() {
        return nationMapper.getAllNations();
    }
    public List<Position> getAllPositions() {
        return positionMapper.getAllPositions();
    }
    public List<JobLevel> getAllJobLevels() {
        return jobLevelMapper.getAllJobLevels();
    }
    public List<Department> getAllDepartments() {
        return departmentMapper.getAllDepartments();
    }
}
