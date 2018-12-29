package com.drivers.demo.dao;

import com.drivers.demo.entity.Study;

import java.util.List;

public interface StudyMapper {
    int deleteByPrimaryKey(Integer studyno);

    int insert(Study record);

    Study selectByPrimaryKey(Integer studyno);

    List<Study> selectAll();

    int updateByPrimaryKey(Study record);
}