package com.example.demo.mapper;

import com.example.demo.entity.MenuRole;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MenuRoleMapper {
    void insertMenuRole(MenuRole menuRole);
}
