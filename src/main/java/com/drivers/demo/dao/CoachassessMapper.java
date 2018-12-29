package com.drivers.demo.dao;

import com.drivers.demo.entity.Coachassess;

import java.util.List;

public interface CoachassessMapper {
    int deleteByPrimaryKey(Integer assessno);

    int insert(Coachassess record);

    Coachassess selectByPrimaryKey(Integer assessno);

    List<Coachassess> selectAll();

    int updateByPrimaryKey(Coachassess record);
}