package com.drivers.demo.dao;

import com.drivers.demo.entity.HtPrivilegs;

import java.util.List;

public interface HtPrivilegsMapper {
    int deleteByPrimaryKey(Integer pno);

    int insert(HtPrivilegs record);

    HtPrivilegs selectByPrimaryKey(Integer pno);

    List<HtPrivilegs> selectAll();

    int updateByPrimaryKey(HtPrivilegs record);
}