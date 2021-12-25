package com.example.demo1.serviceimpl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.example.demo1.bean.InfoBean;
import com.example.demo1.bean.InfoBean2;
import com.example.demo1.bean.InfoBean3;
import com.example.demo1.bean.InfoBean4;
import com.example.demo1.mapper.InfoMapper;
import com.example.demo1.service.InfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.*;

@Service
public class InfoServiceImpl implements InfoService {
    @Resource
    private InfoMapper infoMapper;

    public JSONArray list1 = new JSONArray();
    public JSONArray list2 = new JSONArray();
    public JSONArray list3 = new JSONArray();
    public JSONArray list4 = new JSONArray();
    public JSONArray list5 = new JSONArray();
    public JSONArray list6 = new JSONArray();
    public JSONArray list7 = new JSONArray();
    public JSONArray list8 = new JSONArray();
    public JSONArray list9 = new JSONArray();
    public JSONArray list10 = new JSONArray();

    public void Classify(InfoBean3 data) {
        String num = data.getNum();
        if(Objects.equals(data.getNum(), "")) {
            num = "0";
        }
        switch (data.getYear()) {
            case 2011:
                list1.add(JSON.toJSON(new InfoBean4(data.getProvince(), num)));
                break;
            case 2012:
                list2.add(JSON.toJSON(new InfoBean4(data.getProvince(), num)));
                break;
            case 2013:
                list3.add(JSON.toJSON(new InfoBean4(data.getProvince(), num)));
                break;
            case 2014:
                list4.add(JSON.toJSON(new InfoBean4(data.getProvince(), num)));
                break;
            case 2015:
                list5.add(JSON.toJSON(new InfoBean4(data.getProvince(), num)));
                break;
            case 2016:
                list6.add(JSON.toJSON(new InfoBean4(data.getProvince(), num)));
                break;
            case 2017:
                list7.add(JSON.toJSON(new InfoBean4(data.getProvince(), num)));
                break;
            case 2018:
                list8.add(JSON.toJSON(new InfoBean4(data.getProvince(), num)));
                break;
            case 2019:
                list9.add(JSON.toJSON(new InfoBean4(data.getProvince(), num)));
                break;
            case 2020:
                list10.add(JSON.toJSON(new InfoBean4(data.getProvince(), num)));
            default:
                break;
        }
    }

    public List<JSONArray> DealList() {
        List<JSONArray> list = new LinkedList<>();
        JSONArray copy1 = new JSONArray();
        JSONArray copy2 = new JSONArray();
        JSONArray copy3 = new JSONArray();
        JSONArray copy4 = new JSONArray();
        JSONArray copy5 = new JSONArray();
        JSONArray copy6 = new JSONArray();
        JSONArray copy7 = new JSONArray();
        JSONArray copy8 = new JSONArray();
        JSONArray copy9 = new JSONArray();
        JSONArray copy10 = new JSONArray();
        copy1.addAll(list1);
        copy2.addAll(list2);
        copy3.addAll(list3);
        copy4.addAll(list4);
        copy5.addAll(list5);
        copy6.addAll(list6);
        copy7.addAll(list7);
        copy8.addAll(list8);
        copy9.addAll(list9);
        copy10.addAll(list10);
        list.add(copy1);
        list.add(copy2);
        list.add(copy3);
        list.add(copy4);
        list.add(copy5);
        list.add(copy6);
        list.add(copy7);
        list.add(copy8);
        list.add(copy9);
        list.add(copy10);
        list1.clear();
        list2.clear();
        list3.clear();
        list4.clear();
        list5.clear();
        list6.clear();
        list7.clear();
        list8.clear();
        list9.clear();
        list10.clear();
        return list;
    }


    @Override
    public List<JSONArray> GetAllInfo1() {
        for (InfoBean data:infoMapper.getAllInfo()) {
            Classify(new InfoBean3(data.getYear(), data.getProvince(), data.getEnterprise()));
        }
        return DealList();
    }

    public List<JSONArray> GetAllInfo2() {
        for (InfoBean data:infoMapper.getAllInfo()) {
            Classify(new InfoBean3(data.getYear(), data.getProvince(), data.getEmployee()));
        }
        return DealList();
    }

    public List<JSONArray> GetAllInfo3() {
        for (InfoBean data:infoMapper.getAllInfo()) {
            Classify(new InfoBean3(data.getYear(), data.getProvince(), data.getSalary()));
        }
        return DealList();
    }

    @Override
    public List<InfoBean> GetInfoByYear(Integer year) {
        return infoMapper.getInfoByYear(year);
    }

    @Override
    public List<InfoBean> GetInfoByProvince(String province) {
        return infoMapper.getInfoByProvince(province);
    }

    @Override
    public boolean SignIn(String name, String password) {
        return infoMapper.signIn(name, password) == 1;
    }

    @Override
    public boolean SignUpCheck(String name) {
        return infoMapper.signUpCheck(name) == 0;
    }

    @Override
    public String SignUp(String name, String password, String email) {
        if(SignUpCheck(name)){
            if(infoMapper.signUp(name, password, email) == 1) {
                return "插入成功！";
            }
            else {
                return "插入失败！";
            }
        }
        else {
            return "用户名重复！";
        }
    }

    @Override
    public List<String> GetCompanyByProvince(String province) {
        return infoMapper.getCompanyByProvince(province);
    }

    @Override
    public List<InfoBean2> GetWorkByProvince(String province) {
        return infoMapper.getWorkByProvince(province);
    }

    @Override
    public List<InfoBean2> GetWorkByPandC(String province, String company) {
        return infoMapper.getWorkByPandC(province, company);
    }

    @Override
    public List<JSONArray> GetAll001() {
        for (InfoBean3 data:infoMapper.getAll001()) {
            Classify(data);
        }
        return DealList();
    }

    @Override
    public List<JSONArray> GetAll002() {
        for (InfoBean3 data:infoMapper.getAll002()) {
            Classify(data);
        }
        return DealList();
    }

    @Override
    public List<JSONArray> GetAll003() {
        for (InfoBean3 data:infoMapper.getAll003()) {
            Classify(data);
        }
        return DealList();
    }

    @Override
    public List<JSONArray> GetAll004() {
        for (InfoBean3 data:infoMapper.getAll004()) {
            Classify(data);
        }
        return DealList();
    }

    @Override
    public List<JSONArray> GetAll005() {
        for (InfoBean3 data:infoMapper.getAll005()) {
            Classify(data);
        }
        return DealList();
    }

    @Override
    public List<JSONArray> GetAll006() {
        for (InfoBean3 data:infoMapper.getAll006()) {
            Classify(data);
        }
        return DealList();
    }

    @Override
    public List<JSONArray> GetAll007() {
        for (InfoBean3 data:infoMapper.getAll007()) {
            Classify(data);
        }
        return DealList();
    }

    @Override
    public List<JSONArray> GetAll008() {
        for (InfoBean3 data:infoMapper.getAll008()) {
            Classify(data);
        }
        return DealList();
    }

    @Override
    public List<JSONArray> GetAll009() {
        for (InfoBean3 data:infoMapper.getAll009()) {
            Classify(data);
        }
        return DealList();
    }

    @Override
    public List<JSONArray> GetAll010() {
        for (InfoBean3 data:infoMapper.getAll010()) {
            Classify(data);
        }
        return DealList();
    }

    @Override
    public List<JSONArray> GetAll011() {
        for (InfoBean3 data:infoMapper.getAll011()) {
            Classify(data);
        }
        return DealList();
    }

    @Override
    public List<JSONArray> GetAll012() {
        for (InfoBean3 data:infoMapper.getAll012()) {
            Classify(data);
        }
        return DealList();
    }

    @Override
    public List<JSONArray> GetAll013() {
        for (InfoBean3 data:infoMapper.getAll013()) {
            Classify(data);
        }
        return DealList();
    }

    @Override
    public List<JSONArray> GetAll014() {
        for (InfoBean3 data:infoMapper.getAll014()) {
            Classify(data);
        }
        return DealList();
    }

    @Override
    public List<JSONArray> GetAll015() {
        for (InfoBean3 data:infoMapper.getAll015()) {
            Classify(data);
        }
        return DealList();
    }

    @Override
    public List<JSONArray> GetAll016() {
        for (InfoBean3 data:infoMapper.getAll016()) {
            Classify(data);
        }
        return DealList();
    }

    @Override
    public List<JSONArray> GetAll017() {
        for (InfoBean3 data:infoMapper.getAll017()) {
            Classify(data);
        }
        return DealList();
    }

    @Override
    public List<InfoBean3> GetByYear001(Integer year) {
        return infoMapper.getByYear001(year);
    }

    @Override
    public List<InfoBean3> GetByYear002(Integer year) {
        return infoMapper.getByYear002(year);
    }

    @Override
    public List<InfoBean3> GetByYear003(Integer year) {
        return infoMapper.getByYear003(year);
    }

    @Override
    public List<InfoBean3> GetByYear004(Integer year) {
        return infoMapper.getByYear004(year);
    }

    @Override
    public List<InfoBean3> GetByYear005(Integer year) {
        return infoMapper.getByYear005(year);
    }

    @Override
    public List<InfoBean3> GetByYear006(Integer year) {
        return infoMapper.getByYear006(year);
    }

    @Override
    public List<InfoBean3> GetByYear007(Integer year) {
        return infoMapper.getByYear007(year);
    }

    @Override
    public List<InfoBean3> GetByYear008(Integer year) {
        return infoMapper.getByYear008(year);
    }

    @Override
    public List<InfoBean3> GetByYear009(Integer year) {
        return infoMapper.getByYear009(year);
    }

    @Override
    public List<InfoBean3> GetByYear010(Integer year) {
        return infoMapper.getByYear010(year);
    }

    @Override
    public List<InfoBean3> GetByYear011(Integer year) {
        return infoMapper.getByYear011(year);
    }

    @Override
    public List<InfoBean3> GetByYear012(Integer year) {
        return infoMapper.getByYear012(year);
    }

    @Override
    public List<InfoBean3> GetByYear013(Integer year) {
        return infoMapper.getByYear013(year);
    }

    @Override
    public List<InfoBean3> GetByYear014(Integer year) {
        return infoMapper.getByYear014(year);
    }

    @Override
    public List<InfoBean3> GetByYear015(Integer year) {
        return infoMapper.getByYear015(year);
    }

    @Override
    public List<InfoBean3> GetByYear016(Integer year) {
        return infoMapper.getByYear016(year);
    }

    @Override
    public List<InfoBean3> GetByYear017(Integer year) {
        return infoMapper.getByYear017(year);
    }

    @Override
    public List<InfoBean3> GetByProvince001(String province) {
        return infoMapper.getByProvince001(province);
    }

    @Override
    public List<InfoBean3> GetByProvince002(String province) {
        return infoMapper.getByProvince002(province);
    }

    @Override
    public List<InfoBean3> GetByProvince003(String province) {
        return infoMapper.getByProvince003(province);
    }

    @Override
    public List<InfoBean3> GetByProvince004(String province) {
        return infoMapper.getByProvince004(province);
    }

    @Override
    public List<InfoBean3> GetByProvince005(String province) {
        return infoMapper.getByProvince005(province);
    }

    @Override
    public List<InfoBean3> GetByProvince006(String province) {
        return infoMapper.getByProvince006(province);
    }

    @Override
    public List<InfoBean3> GetByProvince007(String province) {
        return infoMapper.getByProvince007(province);
    }

    @Override
    public List<InfoBean3> GetByProvince008(String province) {
        return infoMapper.getByProvince008(province);
    }

    @Override
    public List<InfoBean3> GetByProvince009(String province) {
        return infoMapper.getByProvince009(province);
    }

    @Override
    public List<InfoBean3> GetByProvince010(String province) {
        return infoMapper.getByProvince010(province);
    }

    @Override
    public List<InfoBean3> GetByProvince011(String province) {
        return infoMapper.getByProvince011(province);
    }

    @Override
    public List<InfoBean3> GetByProvince012(String province) {
        return infoMapper.getByProvince012(province);
    }

    @Override
    public List<InfoBean3> GetByProvince013(String province) {
        return infoMapper.getByProvince013(province);
    }

    @Override
    public List<InfoBean3> GetByProvince014(String province) {
        return infoMapper.getByProvince014(province);
    }

    @Override
    public List<InfoBean3> GetByProvince015(String province) {
        return infoMapper.getByProvince015(province);
    }

    @Override
    public List<InfoBean3> GetByProvince016(String province) {
        return infoMapper.getByProvince016(province);
    }

    @Override
    public List<InfoBean3> GetByProvince017(String province) {
        return infoMapper.getByProvince017(province);
    }

    @Override
    public String Get001(Integer year, String province) { return infoMapper.get001(year, province); }

    @Override
    public String Get002(Integer year, String province) { return infoMapper.get002(year, province); }

    @Override
    public String Get003(Integer year, String province) { return infoMapper.get003(year, province); }

    @Override
    public String Get004(Integer year, String province) { return infoMapper.get004(year, province); }

    @Override
    public String Get005(Integer year, String province) { return infoMapper.get005(year, province); }

    @Override
    public String Get006(Integer year, String province) { return infoMapper.get006(year, province); }

    @Override
    public String Get007(Integer year, String province) { return infoMapper.get007(year, province); }

    @Override
    public String Get008(Integer year, String province) { return infoMapper.get008(year, province); }

    @Override
    public String Get009(Integer year, String province) { return infoMapper.get009(year, province); }

    @Override
    public String Get010(Integer year, String province) { return infoMapper.get010(year, province); }

    @Override
    public String Get011(Integer year, String province) { return infoMapper.get011(year, province); }

    @Override
    public String Get012(Integer year, String province) { return infoMapper.get012(year, province); }

    @Override
    public String Get013(Integer year, String province) { return infoMapper.get013(year, province); }

    @Override
    public String Get014(Integer year, String province) { return infoMapper.get014(year, province); }

    @Override
    public String Get015(Integer year, String province) { return infoMapper.get015(year, province); }

    @Override
    public String Get016(Integer year, String province) { return infoMapper.get016(year, province); }

    @Override
    public String Get017(Integer year, String province) { return infoMapper.get017(year, province); }

    @Override
    public List<JSONArray> GetAllMei001() {
        for (InfoBean3 data:infoMapper.getAllMei001()) {
            Classify(data);
        }
        return DealList();
    }

    @Override
    public List<JSONArray> GetAllMei002() {
        for (InfoBean3 data:infoMapper.getAllMei002()) {
            Classify(data);
        }
        return DealList();
    }

    @Override
    public List<JSONArray> GetAllMei003() {
        for (InfoBean3 data:infoMapper.getAllMei003()) {
            Classify(data);
        }
        return DealList();
    }

    @Override
    public List<JSONArray> GetAllMei004() {
        for (InfoBean3 data:infoMapper.getAllMei004()) {
            Classify(data);
        }
        return DealList();
    }

    @Override
    public List<InfoBean3> GetByYearMei001(Integer year) {
        return infoMapper.getByYearMei001(year);
    }

    @Override
    public List<InfoBean3> GetByYearMei002(Integer year) {
        return infoMapper.getByYearMei002(year);
    }

    @Override
    public List<InfoBean3> GetByYearMei003(Integer year) {
        return infoMapper.getByYearMei003(year);
    }

    @Override
    public List<InfoBean3> GetByYearMei004(Integer year) {
        return infoMapper.getByYearMei004(year);
    }

    @Override
    public List<InfoBean3> GetByProvinceMei001(String province) {
        return infoMapper.getByProvinceMei001(province);
    }

    @Override
    public List<InfoBean3> GetByProvinceMei002(String province) {
        return infoMapper.getByProvinceMei002(province);
    }

    @Override
    public List<InfoBean3> GetByProvinceMei003(String province) {
        return infoMapper.getByProvinceMei003(province);
    }

    @Override
    public List<InfoBean3> GetByProvinceMei004(String province) {
        return infoMapper.getByProvinceMei004(province);
    }

    @Override
    public String GetMei001(Integer year, String province) {
        return infoMapper.getMei001(year, province);
    }

    @Override
    public String GetMei002(Integer year, String province) {
        return infoMapper.getMei002(year, province);
    }

    @Override
    public String GetMei003(Integer year, String province) {
        return infoMapper.getMei003(year, province);
    }

    @Override
    public String GetMei004(Integer year, String province) {
        return infoMapper.getMei004(year, province);
    }

    @Override
    public List<JSONArray> GetAllYing001() {
        for (InfoBean3 data:infoMapper.getAllYing001()) {
            Classify(data);
        }
        return DealList();
    }

    @Override
    public List<JSONArray> GetAllYing002() {
        for (InfoBean3 data:infoMapper.getAllYing002()) {
            Classify(data);
        }
        return DealList();
    }

    @Override
    public List<JSONArray> GetAllYing003() {
        for (InfoBean3 data:infoMapper.getAllYing003()) {
            Classify(data);
        }
        return DealList();
    }

    @Override
    public List<JSONArray> GetAllYing004() {
        for (InfoBean3 data:infoMapper.getAllYing004()) {
            Classify(data);
        }
        return DealList();
    }

    @Override
    public List<InfoBean3> GetByYearYing001(Integer year) {
        return infoMapper.getByYearYing001(year);
    }

    @Override
    public List<InfoBean3> GetByYearYing002(Integer year) {
        return infoMapper.getByYearYing002(year);
    }

    @Override
    public List<InfoBean3> GetByYearYing003(Integer year) {
        return infoMapper.getByYearYing003(year);
    }

    @Override
    public List<InfoBean3> GetByYearYing004(Integer year) {
        return infoMapper.getByYearYing004(year);
    }

    @Override
    public List<InfoBean3> GetByProvinceYing001(String province) {
        return infoMapper.getByProvinceYing001(province);
    }

    @Override
    public List<InfoBean3> GetByProvinceYing002(String province) {
        return infoMapper.getByProvinceYing002(province);
    }

    @Override
    public List<InfoBean3> GetByProvinceYing003(String province) {
        return infoMapper.getByProvinceYing003(province);
    }

    @Override
    public List<InfoBean3> GetByProvinceYing004(String province) {
        return infoMapper.getByProvinceYing004(province);
    }

    @Override
    public String GetYing001(Integer year, String province) {
        return infoMapper.getYing001(year, province);
    }

    @Override
    public String GetYing002(Integer year, String province) {
        return infoMapper.getYing002(year, province);
    }

    @Override
    public String GetYing003(Integer year, String province) {
        return infoMapper.getYing003(year, province);
    }

    @Override
    public String GetYing004(Integer year, String province) {
        return infoMapper.getYing004(year, province);
    }

    @Override
    public List<JSONArray> GetAllE001() {
        for (InfoBean3 data:infoMapper.getAllE001()) {
            Classify(data);
        }
        return DealList();
    }

    @Override
    public List<JSONArray> GetAllE002() {
        for (InfoBean3 data:infoMapper.getAllE002()) {
            Classify(data);
        }
        return DealList();
    }

    @Override
    public List<JSONArray> GetAllE003() {
        for (InfoBean3 data:infoMapper.getAllE003()) {
            Classify(data);
        }
        return DealList();
    }

    @Override
    public List<JSONArray> GetAllE004() {
        for (InfoBean3 data:infoMapper.getAllE004()) {
            Classify(data);
        }
        return DealList();
    }

    @Override
    public List<InfoBean3> GetByYearE001(Integer year) {
        return infoMapper.getByYearE001(year);
    }

    @Override
    public List<InfoBean3> GetByYearE002(Integer year) {
        return infoMapper.getByYearE002(year);
    }

    @Override
    public List<InfoBean3> GetByYearE003(Integer year) {
        return infoMapper.getByYearE003(year);
    }

    @Override
    public List<InfoBean3> GetByYearE004(Integer year) {
        return infoMapper.getByYearE004(year);
    }

    @Override
    public List<InfoBean3> GetByProvinceE001(String province) {
        return infoMapper.getByProvinceE001(province);
    }

    @Override
    public List<InfoBean3> GetByProvinceE002(String province) {
        return infoMapper.getByProvinceE002(province);
    }

    @Override
    public List<InfoBean3> GetByProvinceE003(String province) {
        return infoMapper.getByProvinceE003(province);
    }

    @Override
    public List<InfoBean3> GetByProvinceE004(String province) {
        return infoMapper.getByProvinceE004(province);
    }

    @Override
    public String GetE001(Integer year, String province) {
        return infoMapper.getE001(year, province);
    }

    @Override
    public String GetE002(Integer year, String province) {
        return infoMapper.getE002(year, province);
    }

    @Override
    public String GetE003(Integer year, String province) {
        return infoMapper.getE003(year, province);
    }

    @Override
    public String GetE004(Integer year, String province) {
        return infoMapper.getE004(year, province);
    }
}
