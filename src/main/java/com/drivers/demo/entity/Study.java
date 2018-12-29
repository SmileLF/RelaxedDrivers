package com.drivers.demo.entity;

import java.util.Date;

public class Study {
    private Integer studyno;

    private Integer userno;

    private Date studytime;

    private Integer driverno;

    private Integer subno;

    private String state;

    public Integer getStudyno() {
        return studyno;
    }

    public void setStudyno(Integer studyno) {
        this.studyno = studyno;
    }

    public Integer getUserno() {
        return userno;
    }

    public void setUserno(Integer userno) {
        this.userno = userno;
    }

    public Date getStudytime() {
        return studytime;
    }

    public void setStudytime(Date studytime) {
        this.studytime = studytime;
    }

    public Integer getDriverno() {
        return driverno;
    }

    public void setDriverno(Integer driverno) {
        this.driverno = driverno;
    }

    public Integer getSubno() {
        return subno;
    }

    public void setSubno(Integer subno) {
        this.subno = subno;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }
}