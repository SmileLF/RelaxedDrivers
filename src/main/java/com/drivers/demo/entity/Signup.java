package com.drivers.demo.entity;

import java.util.Date;

public class Signup {
    private Integer signo;

    private Integer userno;

    private Integer driverno;

    private Integer schoolno;

    private Integer mealno;

    private String paytype;

    private Date sigtime;

    private String state;

    public Integer getSigno() {
        return signo;
    }

    public void setSigno(Integer signo) {
        this.signo = signo;
    }

    public Integer getUserno() {
        return userno;
    }

    public void setUserno(Integer userno) {
        this.userno = userno;
    }

    public Integer getDriverno() {
        return driverno;
    }

    public void setDriverno(Integer driverno) {
        this.driverno = driverno;
    }

    public Integer getSchoolno() {
        return schoolno;
    }

    public void setSchoolno(Integer schoolno) {
        this.schoolno = schoolno;
    }

    public Integer getMealno() {
        return mealno;
    }

    public void setMealno(Integer mealno) {
        this.mealno = mealno;
    }

    public String getPaytype() {
        return paytype;
    }

    public void setPaytype(String paytype) {
        this.paytype = paytype == null ? null : paytype.trim();
    }

    public Date getSigtime() {
        return sigtime;
    }

    public void setSigtime(Date sigtime) {
        this.sigtime = sigtime;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }
}