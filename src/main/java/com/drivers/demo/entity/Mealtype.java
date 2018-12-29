package com.drivers.demo.entity;


public class Mealtype {
    private Integer mealno;

    private Integer schoolno;

    private String mealname;

    private Integer driverno;

    private Double mealcost;

    private String taketime;

    private String details;

    public Integer getMealno() {
        return mealno;
    }

    public void setMealno(Integer mealno) {
        this.mealno = mealno;
    }

    public Integer getSchoolno() {
        return schoolno;
    }

    public void setSchoolno(Integer schoolno) {
        this.schoolno = schoolno;
    }

    public String getMealname() {
        return mealname;
    }

    public void setMealname(String mealname) {
        this.mealname = mealname == null ? null : mealname.trim();
    }

    public Integer getDriverno() {
        return driverno;
    }

    public void setDriverno(Integer driverno) {
        this.driverno = driverno;
    }

    public Double getMealcost() {
        return mealcost;
    }

    public void setMealcost(Double mealcost) {
        this.mealcost = mealcost;
    }

    public String getTaketime() {
        return taketime;
    }

    public void setTaketime(String taketime) {
        this.taketime = taketime == null ? null : taketime.trim();
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details == null ? null : details.trim();
    }
}