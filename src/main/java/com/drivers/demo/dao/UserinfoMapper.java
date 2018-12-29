package com.drivers.demo.dao;

import com.drivers.demo.entity.Userinfo;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserinfoMapper {
    //用户注册
    int insert(Userinfo record);
    //用户登录
    Userinfo selectBylogin(String phone, String pwd);
    //使用手机查找
    Userinfo selectbyphone(String phone);
    //根据编号改密码
    int updatepwd(int userno, String newpwd);
}