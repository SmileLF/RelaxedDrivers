package com.drivers.demo.entity;

import java.util.Date;

public class Userinfo {
    private Integer userno;

    private String nickname;

    private String userpwd;

    private String sex;

    private String phone;

    private String mailbox;

    private Integer documentno;

    private String idno;

    private String headimg;

    private String address;

    private Date registertime;

    private String state;
    private String pro;
    private String city;
    private String zpro;
    private String zcity;


    public String getPro() { return pro; }

    public void setPro(String pro) { this.pro = pro; }

    public String getZpro() { return zpro; }

    public void setZpro(String zpro) { this.zpro = zpro; }

    public String getZcity() { return zcity; }

    public void setZcity(String zcity) { this.zcity = zcity; }

    public String getCity() { return city; }

    public void setCity(String city) { this.city = city; }

    public Integer getUserno() {
        return userno;
    }

    public void setUserno(Integer userno) {
        this.userno = userno;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    public String getUserpwd() {
        return userpwd;
    }

    public void setUserpwd(String userpwd) {
        this.userpwd = userpwd == null ? null : userpwd.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getMailbox() {
        return mailbox;
    }

    public void setMailbox(String mailbox) {
        this.mailbox = mailbox == null ? null : mailbox.trim();
    }

    public Integer getDocumentno() {
        return documentno;
    }

    public void setDocumentno(Integer documentno) {
        this.documentno = documentno;
    }

    public String getIdno() {
        return idno;
    }

    public void setIdno(String idno) {
        this.idno = idno == null ? null : idno.trim();
    }

    public String getHeadimg() {
        return headimg;
    }

    public void setHeadimg(String headimg) {
        this.headimg = headimg == null ? null : headimg.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public Date getRegistertime() {
        return registertime;
    }

    public void setRegistertime(Date registertime) {
        this.registertime = registertime;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    @Override
    public String toString() {
        return "Userinfo{" +
                "userno=" + userno +
                ", nickname='" + nickname + '\'' +
                ", userpwd='" + userpwd + '\'' +
                ", sex='" + sex + '\'' +
                ", phone='" + phone + '\'' +
                ", mailbox='" + mailbox + '\'' +
                ", documentno=" + documentno +
                ", idno='" + idno + '\'' +
                ", headimg='" + headimg + '\'' +
                ", address='" + address + '\'' +
                ", registertime=" + registertime +
                ", state='" + state + '\'' +
                ", pro='" + pro + '\'' +
                ", city='" + city + '\'' +
                ", zpro='" + zpro + '\'' +
                ", zcity='" + zcity + '\'' +
                '}';
    }
}