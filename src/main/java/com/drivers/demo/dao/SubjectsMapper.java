package com.drivers.demo.dao;

import com.drivers.demo.entity.Subjects;

import java.util.List;

public interface SubjectsMapper {
    int deleteByPrimaryKey(Integer subno);

    int insert(Subjects record);

    Subjects selectByPrimaryKey(Integer subno);

    List<Subjects> selectAll();

    int updateByPrimaryKey(Subjects record);
}