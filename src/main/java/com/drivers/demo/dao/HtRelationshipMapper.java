package com.drivers.demo.dao;

import com.drivers.demo.entity.HtRelationship;

import java.util.List;

public interface HtRelationshipMapper {
    int deleteByPrimaryKey(Integer reno);

    int insert(HtRelationship record);

    HtRelationship selectByPrimaryKey(Integer reno);

    List<HtRelationship> selectAll();

    int updateByPrimaryKey(HtRelationship record);
}