package com.drivers.demo.dao;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface ProcityMapper {

    /**
     * 查找省份
     * @return
     */
    List<Map<String,Object>> findPro();

    /**
     * 根据省份查找城市
     * @param prono
     * @return
     */
    List<Map<String,Object>> findCity(String prono);
}