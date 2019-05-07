package com.dx21601.pojo;

import java.util.Date;

public class Student {
    private String sSid;

    private String sName;

    private String sSex;

    private String sNumber;

    private Date sBirthday;

    private String sPassword;

    private String sSushehao;

    public Student(String sSid, String sName, String sSex, String sNumber, Date sBirthday, String sPassword, String sSushehao) {
        this.sSid = sSid;
        this.sName = sName;
        this.sSex = sSex;
        this.sNumber = sNumber;
        this.sBirthday = sBirthday;
        this.sPassword = sPassword;
        this.sSushehao = sSushehao;
    }

    public Student() {
        super();
    }

    public String getsSid() {
        return sSid;
    }

    public void setsSid(String sSid) {
        this.sSid = sSid == null ? null : sSid.trim();
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName == null ? null : sName.trim();
    }

    public String getsSex() {
        return sSex;
    }

    public void setsSex(String sSex) {
        this.sSex = sSex == null ? null : sSex.trim();
    }

    public String getsNumber() {
        return sNumber;
    }

    public void setsNumber(String sNumber) {
        this.sNumber = sNumber == null ? null : sNumber.trim();
    }

    public Date getsBirthday() {
        return sBirthday;
    }

    public void setsBirthday(Date sBirthday) {
        this.sBirthday = sBirthday;
    }

    public String getsPassword() {
        return sPassword;
    }

    public void setsPassword(String sPassword) {
        this.sPassword = sPassword == null ? null : sPassword.trim();
    }

    public String getsSushehao() {
        return sSushehao;
    }

    public void setsSushehao(String sSushehao) {
        this.sSushehao = sSushehao == null ? null : sSushehao.trim();
    }
}