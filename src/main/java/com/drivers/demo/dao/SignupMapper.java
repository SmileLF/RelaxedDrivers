package com.drivers.demo.dao;

import com.drivers.demo.entity.Signup;

import java.util.List;

public interface SignupMapper {
    int deleteByPrimaryKey(Integer signo);

    int insert(Signup record);

    Signup selectByPrimaryKey(Integer signo);

    List<Signup> selectAll();

    int updateByPrimaryKey(Signup record);
}