package com.drivers.demo.dao;

import com.drivers.demo.entity.HtRoles;

import java.util.List;

public interface HtRolesMapper {
    int deleteByPrimaryKey(Integer rno);

    int insert(HtRoles record);

    HtRoles selectByPrimaryKey(Integer rno);

    List<HtRoles> selectAll();

    int updateByPrimaryKey(HtRoles record);
}