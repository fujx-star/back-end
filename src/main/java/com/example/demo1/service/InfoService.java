package com.example.demo1.service;

import com.example.demo1.bean.InfoBean;
import com.example.demo1.bean.InfoBean2;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface InfoService {
    List<InfoBean> GetAllInfo();
    List<InfoBean> GetInfoByYear(Integer year);
    List<InfoBean> GetInfoByProvince(String province);
    boolean SignIn(String name, String password);
    boolean SignUpCheck(String name);
    String SignUp(String name, String password, String email);
    List<String> GetCompanyByProvince(String province);
    List<InfoBean2> GetWorkByPandC(String province, String company);
}
