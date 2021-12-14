package com.example.demo1.bean;

import com.alibaba.fastjson.annotation.JSONField;

public class InfoBean4 {

    @JSONField(name = "name")
    private String province;

    @JSONField(name = "value")
    private String num;

    public InfoBean4(String province, String num) {
        this.province = province;
        this.num = num;
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
