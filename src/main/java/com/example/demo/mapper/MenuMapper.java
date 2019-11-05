package com.example.demo.mapper;

import com.example.demo.entity.Menu;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MenuMapper {
    void insertMenu(Menu menu);
    List<Menu> getAllMenus();
}
