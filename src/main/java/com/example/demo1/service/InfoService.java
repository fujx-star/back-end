package com.example.demo1.service;

import com.alibaba.fastjson.JSONArray;
import com.example.demo1.bean.InfoBean;
import com.example.demo1.bean.InfoBean2;
import com.example.demo1.bean.InfoBean3;
import com.example.demo1.bean.InfoBean4;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface InfoService {
    List<JSONArray> GetAllInfo1();
    List<JSONArray> GetAllInfo2();
    List<JSONArray> GetAllInfo3();
    List<InfoBean> GetInfoByYear(Integer year);
    List<InfoBean> GetInfoByProvince(String province);
    boolean SignIn(String name, String password);
    boolean SignUpCheck(String name);
    String SignUp(String name, String password, String email);
    List<String> GetCompanyByProvince(String province);
    List<InfoBean2> GetWorkByProvince(String province);
    List<InfoBean2> GetWorkByPandC(String province, String company);
    List<JSONArray> GetAll001();
    List<JSONArray> GetAll002();
    List<JSONArray> GetAll003();
    List<JSONArray> GetAll004();
    List<JSONArray> GetAll005();
    List<JSONArray> GetAll006();
    List<JSONArray> GetAll007();
    List<JSONArray> GetAll008();
    List<JSONArray> GetAll009();
    List<JSONArray> GetAll010();
    List<JSONArray> GetAll011();
    List<JSONArray> GetAll012();
    List<JSONArray> GetAll013();
    List<JSONArray> GetAll014();
    List<JSONArray> GetAll015();
    List<JSONArray> GetAll016();
    List<JSONArray> GetAll017();
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
    List<JSONArray> GetAllMei001();
    List<JSONArray> GetAllMei002();
    List<JSONArray> GetAllMei003();
    List<JSONArray> GetAllMei004();
    List<InfoBean3> GetByYearMei001(Integer year);
    List<InfoBean3> GetByYearMei002(Integer year);
    List<InfoBean3> GetByYearMei003(Integer year);
    List<InfoBean3> GetByYearMei004(Integer year);
    List<InfoBean3> GetByProvinceMei001(String province);
    List<InfoBean3> GetByProvinceMei002(String province);
    List<InfoBean3> GetByProvinceMei003(String province);
    List<InfoBean3> GetByProvinceMei004(String province);
    String GetMei001(Integer year, String province);
    String GetMei002(Integer year, String province);
    String GetMei003(Integer year, String province);
    String GetMei004(Integer year, String province);
    List<JSONArray> GetAllYing001();
    List<JSONArray> GetAllYing002();
    List<JSONArray> GetAllYing003();
    List<JSONArray> GetAllYing004();
    List<InfoBean3> GetByYearYing001(Integer year);
    List<InfoBean3> GetByYearYing002(Integer year);
    List<InfoBean3> GetByYearYing003(Integer year);
    List<InfoBean3> GetByYearYing004(Integer year);
    List<InfoBean3> GetByProvinceYing001(String province);
    List<InfoBean3> GetByProvinceYing002(String province);
    List<InfoBean3> GetByProvinceYing003(String province);
    List<InfoBean3> GetByProvinceYing004(String province);
    String GetYing001(Integer year, String province);
    String GetYing002(Integer year, String province);
    String GetYing003(Integer year, String province);
    String GetYing004(Integer year, String province);
    List<JSONArray> GetAllE001();
    List<JSONArray> GetAllE002();
    List<JSONArray> GetAllE003();
    List<JSONArray> GetAllE004();
    List<InfoBean3> GetByYearE001(Integer year);
    List<InfoBean3> GetByYearE002(Integer year);
    List<InfoBean3> GetByYearE003(Integer year);
    List<InfoBean3> GetByYearE004(Integer year);
    List<InfoBean3> GetByProvinceE001(String province);
    List<InfoBean3> GetByProvinceE002(String province);
    List<InfoBean3> GetByProvinceE003(String province);
    List<InfoBean3> GetByProvinceE004(String province);
    String GetE001(Integer year, String province);
    String GetE002(Integer year, String province);
    String GetE003(Integer year, String province);
    String GetE004(Integer year, String province);
}
