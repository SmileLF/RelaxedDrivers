package com.drivers.demo.dao;

import com.drivers.demo.entity.Driverschool;

import java.util.List;

public interface DriverschoolMapper {
    int deleteByPrimaryKey(Integer schoolno);

    int insert(Driverschool record);

    Driverschool selectByPrimaryKey(Integer schoolno);

    List<Driverschool> selectAll();

    int updateByPrimaryKey(Driverschool record);
}