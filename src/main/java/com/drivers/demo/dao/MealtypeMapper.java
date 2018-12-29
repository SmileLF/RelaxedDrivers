package com.drivers.demo.dao;

import com.drivers.demo.entity.Mealtype;

import java.util.List;

public interface MealtypeMapper {
    int deleteByPrimaryKey(Integer mealno);

    int insert(Mealtype record);

    Mealtype selectByPrimaryKey(Integer mealno);

    List<Mealtype> selectAll();

    int updateByPrimaryKey(Mealtype record);
}