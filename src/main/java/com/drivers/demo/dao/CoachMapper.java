package com.drivers.demo.dao;

import com.drivers.demo.entity.Coach;

import java.util.List;

public interface CoachMapper {
    int deleteByPrimaryKey(Integer coachno);

    int insert(Coach record);

    Coach selectByPrimaryKey(Integer coachno);

    List<Coach> selectAll();

    int updateByPrimaryKey(Coach record);
}