package com.example.demo.mapper;

import com.example.demo.entity.UserRole;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserRoleMapper {
    void insertUserRole(UserRole userRole);
}
