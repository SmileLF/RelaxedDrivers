package com.drivers.demo.dao;

import com.drivers.demo.entity.HtSysusers;

import java.util.List;

public interface HtSysusersMapper {
    int deleteByPrimaryKey(Integer uno);

    int insert(HtSysusers record);

    HtSysusers selectByPrimaryKey(Integer uno);

    List<HtSysusers> selectAll();

    int updateByPrimaryKey(HtSysusers record);
}