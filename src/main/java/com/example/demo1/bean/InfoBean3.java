package com.example.demo1.bean;

import com.alibaba.fastjson.annotation.JSONField;

public class InfoBean3 {
    private int year;
    @JSONField(name = "name")
    private String province;
    @JSONField(name = "value")
    private String num;

    public InfoBean3(int year, String province, String num) {
        this.year = year;
        this.province = province;
        this.num = num;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }
}
