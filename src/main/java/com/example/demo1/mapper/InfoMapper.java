package com.example.demo1.mapper;

import com.example.demo1.bean.InfoBean;
import com.example.demo1.bean.InfoBean1;
import com.example.demo1.bean.InfoBean2;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public interface InfoMapper {
    List<InfoBean> getAllInfo();
    List<InfoBean> getInfoByYear(Integer year);
    List<InfoBean> getInfoByProvince(String province);
    Integer signIn(String name, String password);
    Integer signUpCheck(String name);
    Integer signUp(String name, String password, String email);
    List<String> getCompanyByProvince(String province);
    List<InfoBean2> getWorkByPandC(@RequestParam("province") String province, @RequestParam("company") String company);
    String get001(@RequestParam("year") Integer year, @RequestParam("province") String province);
    String get002(@RequestParam("year") Integer year, @RequestParam("province") String province);
    String get003(@RequestParam("year") Integer year, @RequestParam("province") String province);
    String get004(@RequestParam("year") Integer year, @RequestParam("province") String province);
    String get005(@RequestParam("year") Integer year, @RequestParam("province") String province);
    String get006(@RequestParam("year") Integer year, @RequestParam("province") String province);
    String get007(@RequestParam("year") Integer year, @RequestParam("province") String province);
    String get008(@RequestParam("year") Integer year, @RequestParam("province") String province);
    String get009(@RequestParam("year") Integer year, @RequestParam("province") String province);
    String get010(@RequestParam("year") Integer year, @RequestParam("province") String province);
    String get011(@RequestParam("year") Integer year, @RequestParam("province") String province);
    String get012(@RequestParam("year") Integer year, @RequestParam("province") String province);
    String get013(@RequestParam("year") Integer year, @RequestParam("province") String province);
    String get014(@RequestParam("year") Integer year, @RequestParam("province") String province);
    String get015(@RequestParam("year") Integer year, @RequestParam("province") String province);
    String get016(@RequestParam("year") Integer year, @RequestParam("province") String province);
    String get017(@RequestParam("year") Integer year, @RequestParam("province") String province);
}
