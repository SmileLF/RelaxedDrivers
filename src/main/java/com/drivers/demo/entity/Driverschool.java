package com.drivers.demo.entity;

import java.util.Date;

public class Driverschool {
    private Integer schoolno;

    private String schoolname;

    private String phone;

    private String img;

    private String address;

    private Date esttime;

    private String survey;

    private Double avgstar;

    private String person;

    private String state;

    public Integer getSchoolno() {
        return schoolno;
    }

    public void setSchoolno(Integer schoolno) {
        this.schoolno = schoolno;
    }

    public String getSchoolname() {
        return schoolname;
    }

    public void setSchoolname(String schoolname) {
        this.schoolname = schoolname == null ? null : schoolname.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img == null ? null : img.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public Date getEsttime() {
        return esttime;
    }

    public void setEsttime(Date esttime) {
        this.esttime = esttime;
    }

    public String getSurvey() {
        return survey;
    }

    public void setSurvey(String survey) {
        this.survey = survey == null ? null : survey.trim();
    }

    public Double getAvgstar() {
        return avgstar;
    }

    public void setAvgstar(Double avgstar) {
        this.avgstar = avgstar;
    }

    public String getPerson() {
        return person;
    }

    public void setPerson(String person) {
        this.person = person == null ? null : person.trim();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }
}