package com.drivers.demo.dao;

import com.drivers.demo.entity.Driverstype;

import java.util.List;

public interface DriverstypeMapper {
    int deleteByPrimaryKey(Integer driverno);

    int insert(Driverstype record);

    Driverstype selectByPrimaryKey(Integer driverno);

    List<Driverstype> selectAll();

    int updateByPrimaryKey(Driverstype record);
}