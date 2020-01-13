package com.example.demo.mapper;

import com.example.demo.entity.Employee;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

@Mapper
public interface EmployeeMapper {
    Employee getEmployeeById(Integer id);
    List<Employee> getEmployeeByPage(@Param("page") Integer page, @Param("size") Integer size,
                                     @Param("emp") Employee employee,
                                     @Param("beginDateScope") Date[] beginDateScope);
    Integer getTotal(@Param("emp") Employee employee, @Param("beginDateScope") Date[] beginDateScope);
}
