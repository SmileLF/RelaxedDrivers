package com.drivers.demo.dao;

import com.drivers.demo.entity.Documenttype;

import java.util.List;

public interface DocumenttypeMapper {
    int deleteByPrimaryKey(Integer documentnoint);

    int insert(Documenttype record);

    Documenttype selectByPrimaryKey(Integer documentnoint);

    List<Documenttype> selectAll();

    int updateByPrimaryKey(Documenttype record);
}