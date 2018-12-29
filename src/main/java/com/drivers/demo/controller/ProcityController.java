package com.drivers.demo.controller;

import com.drivers.demo.service.ProcityService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("procity")
public class ProcityController {
    @Resource
    ProcityService ps;

    @RequestMapping("findPro")
    @ResponseBody
    public List<Map<String,Object>> findPro(){
       return ps.findPro();
    }

    @RequestMapping("findCity")
    @ResponseBody
    public List<Map<String,Object>> findCity(String prono){
        return ps.findCity(prono);
    }
}
