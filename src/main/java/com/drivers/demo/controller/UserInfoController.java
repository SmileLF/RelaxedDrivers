package com.drivers.demo.controller;

import com.drivers.demo.entity.Userinfo;
import com.drivers.demo.service.UserInfoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("userinfo")
public class UserInfoController {
    @Resource
    private UserInfoService us;

    @RequestMapping("center")
    public String center(){
        return "usercenter";
    }
    @RequestMapping("checkpwd")
    public String checkpwd(){
        return "forgetPwd1";
    }
    @RequestMapping("checkclause")
    public String checkclause(){
        return "clause";
    }
    @RequestMapping("checklogin")
    public String checklogin(){
        return "login";
    }
    @RequestMapping("checkreg")
    public String checkreg(){
        return "userregister";
    }
    /**
     * 登录校验
     * @param phone
     * @param loginpwd
     * @return
     */
    @RequestMapping("checkUser")
    @ResponseBody
    public int checkUser(String phone, String loginpwd){
        Userinfo user=us.uslogin(phone,loginpwd);
        if(null!=user) {
            return 1;
        }else {
            return 0;
        }
    }

    /**
     * 登录
     * @param phone
     * @param loginpwd
     * @return
     */
    @RequestMapping("login")
    public String login(String phone, String loginpwd, HttpServletRequest request){
        HttpSession session = request.getSession();
        Userinfo user=us.uslogin(phone,loginpwd);
        session.setAttribute("user",user);

        return "home";
    }
    /**
     * 快速注册
     * @param u
     * @return
     */
    @RequestMapping("register")
    public String register(Userinfo u){
        int res=us.register(u);
        if(res>0){
            return "login";
        }else{
            return "userregister";
        }
    }
    @RequestMapping("findbyphone")
    @ResponseBody
    public int findbyphone(String phones){
        Userinfo u= us.findbyphone(phones);
        if(null==u){
            return 0;
        }else {
            return 1;
        }
    }
    @RequestMapping("findbyphone1")
    public String findbyphone(String phone, Model m){
        Userinfo u= us.findbyphone(phone);
        if(null==u){
            return "forgetPwd1";
        }else {
            m.addAttribute("uinfo",u);
            return "forgetPwd2";
        }
    }
    @RequestMapping("updatepwd")
    public String updatepwd(int userno,String newpwd){
        int res=us.updatepwd(userno,newpwd);
        if(res>0){
            return "forgetPwd3";
        }
        return "page/forgetPwd2";
    }
    /**
     * 发送短信验证码
     * @param phones
     * @param yzm
     * @return
     */
    @RequestMapping("phonere")
    @ResponseBody
    public String phonere(String phones,String yzm){
        System.out.println(phones);
        yzm=String.valueOf((int)((Math.random()*9+1)*100000));
        System.out.println(yzm+"------------------------");
        System.out.println(phones+"------------------------");
        //获取生产的随机数
        String sid = "dac07b2c7c6891a9f6d662977c06c2af";
        String token = "d053852ec296a0439f6f3099192c06c3";
        String appid = "6b1256b09f294205a405feed6df2068b";
        String templateid = "390523";//模板id
        String param = yzm;//发送的短信信息
        String mobile = phones;//18838167752
        String uid = "e318006bf7604bea9cd49b41602df760";
        RestTest.testSendSms(sid, token, appid, templateid, param, mobile, uid);
        return yzm;
    }
}
