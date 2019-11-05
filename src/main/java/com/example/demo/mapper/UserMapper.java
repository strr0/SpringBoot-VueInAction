package com.example.demo.mapper;

import com.example.demo.entity.Role;
import com.example.demo.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    void insertUser(User user);
    User findUserByUsername(String username);
    List<Role> findUserRoleByUid(Integer id);
}
