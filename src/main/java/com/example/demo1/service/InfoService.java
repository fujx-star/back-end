package com.example.demo1.service;

import com.example.demo1.bean.InfoBean;

import java.util.List;

public interface InfoService {
    List<InfoBean> GetInfoByPv(String province);
    List<InfoBean> GetInfoByYear(Integer year);
}
