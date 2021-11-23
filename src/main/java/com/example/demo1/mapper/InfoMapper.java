package com.example.demo1.mapper;

import com.example.demo1.bean.InfoBean;

import java.util.List;

public interface InfoMapper {
    List<InfoBean> getInfo(String province);
    List<InfoBean> getInfo1(Integer year);
}
