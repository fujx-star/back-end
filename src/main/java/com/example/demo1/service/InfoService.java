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
    String Get001(Integer year, String province);
    String Get002(Integer year, String province);
    String Get003(Integer year, String province);
    String Get004(Integer year, String province);
    String Get005(Integer year, String province);
    String Get006(Integer year, String province);
    String Get007(Integer year, String province);
    String Get008(Integer year, String province);
    String Get009(Integer year, String province);
    String Get010(Integer year, String province);
    String Get011(Integer year, String province);
    String Get012(Integer year, String province);
    String Get013(Integer year, String province);
    String Get014(Integer year, String province);
    String Get015(Integer year, String province);
    String Get016(Integer year, String province);
    String Get017(Integer year, String province);


}
