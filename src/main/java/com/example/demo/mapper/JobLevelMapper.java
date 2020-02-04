package com.example.demo.mapper;

import com.example.demo.entity.JobLevel;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface JobLevelMapper {
    List<JobLevel> getAllJobLevels();
}
