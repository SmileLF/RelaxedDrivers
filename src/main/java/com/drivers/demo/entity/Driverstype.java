package com.drivers.demo.entity;

public class Driverstype {
    private Integer driverno;

    private String drivername;

    private String explain;

    public Integer getDriverno() {
        return driverno;
    }

    public void setDriverno(Integer driverno) {
        this.driverno = driverno;
    }

    public String getDrivername() {
        return drivername;
    }

    public void setDrivername(String drivername) {
        this.drivername = drivername == null ? null : drivername.trim();
    }

    public String getExplain() {
        return explain;
    }

    public void setExplain(String explain) {
        this.explain = explain == null ? null : explain.trim();
    }
}