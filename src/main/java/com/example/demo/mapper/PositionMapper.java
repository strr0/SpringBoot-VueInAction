package com.example.demo.mapper;

import com.example.demo.entity.Position;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PositionMapper {
    List<Position> getAllPositions();
}
