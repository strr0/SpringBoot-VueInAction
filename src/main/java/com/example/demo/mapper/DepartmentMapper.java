package com.example.demo.mapper;

import com.example.demo.entity.Department;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DepartmentMapper {
    List<Department> getAllDepartments();
}
