package com.example.demo.mapper;

import com.example.demo.entity.Politic;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PoliticMapper {
    List<Politic> getAllPolitics();
}
