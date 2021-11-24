package com.example.demo1.mapper;

import com.example.demo1.bean.InfoBean;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface InfoMapper {
    List<InfoBean> getInfo(Integer year);
    List<InfoBean> getInfo1(String province);
    List<InfoBean> getInfo2(@Param("year")Integer year, @Param("province")String province);
}
