package com.drivers.demo.entity;

import java.util.Date;

public class Schoolassess {
    private Integer assessno;

    private Integer schoolno;

    private Integer userno;

    private String content;

    private Double star;

    private Date time;

    private String state;

    public Integer getAssessno() {
        return assessno;
    }

    public void setAssessno(Integer assessno) {
        this.assessno = assessno;
    }

    public Integer getSchoolno() {
        return schoolno;
    }

    public void setSchoolno(Integer schoolno) {
        this.schoolno = schoolno;
    }

    public Integer getUserno() {
        return userno;
    }

    public void setUserno(Integer userno) {
        this.userno = userno;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Double getStar() {
        return star;
    }

    public void setStar(Double star) {
        this.star = star;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }
}