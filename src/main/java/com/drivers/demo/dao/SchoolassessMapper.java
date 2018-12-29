package com.drivers.demo.dao;

import com.drivers.demo.entity.Schoolassess;

import java.util.List;

public interface SchoolassessMapper {
    int deleteByPrimaryKey(Integer assessno);

    int insert(Schoolassess record);

    Schoolassess selectByPrimaryKey(Integer assessno);

    List<Schoolassess> selectAll();

    int updateByPrimaryKey(Schoolassess record);
}