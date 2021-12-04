package com.example.demo1.mapper;

import com.example.demo1.bean.InfoBean;
import com.example.demo1.bean.InfoBean1;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface InfoMapper {
    List<InfoBean> getInfoByYear(Integer year);
    List<InfoBean> getInfoByProvince(String province);
    Integer signIn(String name, String password);
    Integer signUpCheck(String name);
    Integer signUp(String name, String password, String email);
}
