package com.example.demo1.service;

import com.example.demo1.bean.InfoBean;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface InfoService {
    List<InfoBean> GetInfoByYear(Integer year);
    List<InfoBean> GetInfoByPv(String province);
    List<InfoBean> GetInfoByPvandYear(Integer year, String province);
}
