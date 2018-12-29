package com.drivers.demo.entity;

import java.util.Date;

public class Coach {
    private Integer coachno;

    private String fullname;

    private String userpwd;

    private String sex;

    private String phone;

    private String mailbox;

    private Integer documentno;

    private String idno;

    private String headimg;

    private String address;

    private Date registertime;

    private Integer schoolno;

    private Double avgstar;

    private String state;

    public Integer getCoachno() {
        return coachno;
    }

    public void setCoachno(Integer coachno) {
        this.coachno = coachno;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname == null ? null : fullname.trim();
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

    public Integer getSchoolno() {
        return schoolno;
    }

    public void setSchoolno(Integer schoolno) {
        this.schoolno = schoolno;
    }

    public Double getAvgstar() {
        return avgstar;
    }

    public void setAvgstar(Double avgstar) {
        this.avgstar = avgstar;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }
}