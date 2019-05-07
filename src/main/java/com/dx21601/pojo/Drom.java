package com.dx21601.pojo;

public class Drom {
    private String dId;

    private Integer dSum;

    public Drom(String dId, Integer dSum) {
        this.dId = dId;
        this.dSum = dSum;
    }

    public Drom() {
        super();
    }

    public String getdId() {
        return dId;
    }

    public void setdId(String dId) {
        this.dId = dId == null ? null : dId.trim();
    }

    public Integer getdSum() {
        return dSum;
    }

    public void setdSum(Integer dSum) {
        this.dSum = dSum;
    }
}