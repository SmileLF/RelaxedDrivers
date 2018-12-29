package com.drivers.demo.entity;

import java.util.Date;

public class Coachassess {
    private Integer assessno;

    private Integer coachno;

    private Integer appraiser;

    private Double star;

    private Date time;

    private String content;

    private String state;

    public Integer getAssessno() {
        return assessno;
    }

    public void setAssessno(Integer assessno) {
        this.assessno = assessno;
    }

    public Integer getCoachno() {
        return coachno;
    }

    public void setCoachno(Integer coachno) {
        this.coachno = coachno;
    }

    public Integer getAppraiser() {
        return appraiser;
    }

    public void setAppraiser(Integer appraiser) {
        this.appraiser = appraiser;
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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }
}