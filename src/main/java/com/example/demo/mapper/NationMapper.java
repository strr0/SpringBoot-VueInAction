package com.example.demo.mapper;

import com.example.demo.entity.Nation;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface NationMapper {
    List<Nation> getAllNations();
}
