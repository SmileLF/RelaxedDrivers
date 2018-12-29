package com.drivers.demo.service;

import com.drivers.demo.dao.ProcityMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service
public class ProcityService {
    @Resource
    ProcityMapper pm;

    //查找省份
    public List<Map<String,Object>> findPro(){
        return pm.findPro();
    }
    //查找城市
    public List<Map<String,Object>> findCity(String prono){
        return pm.findCity(prono);
    }
}
