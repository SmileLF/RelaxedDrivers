package com.drivers.demo.service;

import com.drivers.demo.dao.UserinfoMapper;
import com.drivers.demo.entity.Userinfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserInfoService {
    @Resource
    private UserinfoMapper um;
    //登录
    public Userinfo uslogin(String phone, String pwd){
        return um.selectBylogin(phone,pwd);
    }
    //注册
    public int register(Userinfo u){return um.insert(u); }
    //根据手机查找用户
    public Userinfo findbyphone(String phone){ return um.selectbyphone(phone);}
    //修改密码
    public int updatepwd(int userno,String newpwd){return um.updatepwd(userno,newpwd);}
}
