package com.example.demo1.service;

import com.example.demo1.bean.InfoBean;
import com.example.demo1.bean.InfoBean2;
import com.example.demo1.bean.InfoBean3;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface InfoService {
    List<InfoBean> GetAllInfo();
    List<InfoBean> GetInfoByYear(Integer year);
    List<InfoBean> GetInfoByProvince(String province);
    boolean SignIn(String name, String password);
    boolean SignUpCheck(String name);
    String SignUp(String name, String password, String email);
    List<String> GetCompanyByProvince(String province);
    List<InfoBean2> GetWorkByPandC(String province, String company);
    List<Map<String, String>> GetAll001();
    List<InfoBean3> GetAll002();
    List<InfoBean3> GetAll003();
    List<InfoBean3> GetAll004();
    List<InfoBean3> GetAll005();
    List<InfoBean3> GetAll006();
    List<InfoBean3> GetAll007();
    List<InfoBean3> GetAll008();
    List<InfoBean3> GetAll009();
    List<InfoBean3> GetAll010();
    List<InfoBean3> GetAll011();
    List<InfoBean3> GetAll012();
    List<InfoBean3> GetAll013();
    List<InfoBean3> GetAll014();
    List<InfoBean3> GetAll015();
    List<InfoBean3> GetAll016();
    List<InfoBean3> GetAll017();
    List<InfoBean3> GetByYear001(Integer year);
    List<InfoBean3> GetByYear002(Integer year);
    List<InfoBean3> GetByYear003(Integer year);
    List<InfoBean3> GetByYear004(Integer year);
    List<InfoBean3> GetByYear005(Integer year);
    List<InfoBean3> GetByYear006(Integer year);
    List<InfoBean3> GetByYear007(Integer year);
    List<InfoBean3> GetByYear008(Integer year);
    List<InfoBean3> GetByYear009(Integer year);
    List<InfoBean3> GetByYear010(Integer year);
    List<InfoBean3> GetByYear011(Integer year);
    List<InfoBean3> GetByYear012(Integer year);
    List<InfoBean3> GetByYear013(Integer year);
    List<InfoBean3> GetByYear014(Integer year);
    List<InfoBean3> GetByYear015(Integer year);
    List<InfoBean3> GetByYear016(Integer year);
    List<InfoBean3> GetByYear017(Integer year);
    List<InfoBean3> GetByProvince001(String province);
    List<InfoBean3> GetByProvince002(String province);
    List<InfoBean3> GetByProvince003(String province);
    List<InfoBean3> GetByProvince004(String province);
    List<InfoBean3> GetByProvince005(String province);
    List<InfoBean3> GetByProvince006(String province);
    List<InfoBean3> GetByProvince007(String province);
    List<InfoBean3> GetByProvince008(String province);
    List<InfoBean3> GetByProvince009(String province);
    List<InfoBean3> GetByProvince010(String province);
    List<InfoBean3> GetByProvince011(String province);
    List<InfoBean3> GetByProvince012(String province);
    List<InfoBean3> GetByProvince013(String province);
    List<InfoBean3> GetByProvince014(String province);
    List<InfoBean3> GetByProvince015(String province);
    List<InfoBean3> GetByProvince016(String province);
    List<InfoBean3> GetByProvince017(String province);
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
