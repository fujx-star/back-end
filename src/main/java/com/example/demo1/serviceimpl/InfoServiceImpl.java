package com.example.demo1.serviceimpl;

import com.example.demo1.bean.InfoBean;
import com.example.demo1.bean.InfoBean2;
import com.example.demo1.bean.InfoBean3;
import com.example.demo1.mapper.InfoMapper;
import com.example.demo1.service.InfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

@Service
public class InfoServiceImpl implements InfoService {
    @Resource
    private InfoMapper infoMapper;

    @Override
    public List<InfoBean> GetAllInfo() {
        return infoMapper.getAllInfo();
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
    public List<InfoBean2> GetWorkByPandC(String province, String company) {
        return infoMapper.getWorkByPandC(province, company);
    }

    @Override
    public List<Map<String, String>> GetAll001() {
        HashMap<String, String> map1 = new HashMap<>();
        HashMap<String, String> map2 = new HashMap<>();
        HashMap<String, String> map3 = new HashMap<>();
        HashMap<String, String> map4 = new HashMap<>();
        HashMap<String, String> map5 = new HashMap<>();
        HashMap<String, String> map6 = new HashMap<>();
        HashMap<String, String> map7 = new HashMap<>();
        HashMap<String, String> map8 = new HashMap<>();
        HashMap<String, String> map9 = new HashMap<>();
        List<Map<String, String>> list =  new LinkedList<>();
        for (InfoBean3 data:infoMapper.getAll001()) {
            if(data.getNum() != null) {
                switch (data.getYear()) {
                    case 2011:
                        map1.put(data.getProvince(), data.getNum());
                    case 2012:
                        map2.put(data.getProvince(), data.getNum());
                    case 2013:
                        map3.put(data.getProvince(), data.getNum());
                    case 2014:
                        map4.put(data.getProvince(), data.getNum());
                    case 2015:
                        map5.put(data.getProvince(), data.getNum());
                    case 2016:
                        map6.put(data.getProvince(), data.getNum());
                    case 2017:
                        map7.put(data.getProvince(), data.getNum());
                    case 2018:
                        map8.put(data.getProvince(), data.getNum());
                    case 2019:
                        map9.put(data.getProvince(), data.getNum());
                }
            }
        }
        list.add(map1);
        list.add(map2);
        list.add(map3);
        list.add(map4);
        list.add(map5);
        list.add(map6);
        list.add(map7);
        list.add(map8);
        list.add(map9);
        return list;
    }

    @Override
    public List<InfoBean3> GetAll002() { return infoMapper.getAll002(); }

    @Override
    public List<InfoBean3> GetAll003() { return infoMapper.getAll003(); }

    @Override
    public List<InfoBean3> GetAll004() { return infoMapper.getAll004(); }

    @Override
    public List<InfoBean3> GetAll005() { return infoMapper.getAll005(); }

    @Override
    public List<InfoBean3> GetAll006() { return infoMapper.getAll006(); }

    @Override
    public List<InfoBean3> GetAll007() { return infoMapper.getAll007(); }

    @Override
    public List<InfoBean3> GetAll008() { return infoMapper.getAll008(); }

    @Override
    public List<InfoBean3> GetAll009() { return infoMapper.getAll009(); }

    @Override
    public List<InfoBean3> GetAll010() { return infoMapper.getAll010(); }

    @Override
    public List<InfoBean3> GetAll011() { return infoMapper.getAll011(); }

    @Override
    public List<InfoBean3> GetAll012() { return infoMapper.getAll012(); }

    @Override
    public List<InfoBean3> GetAll013() { return infoMapper.getAll013(); }

    @Override
    public List<InfoBean3> GetAll014() { return infoMapper.getAll014(); }

    @Override
    public List<InfoBean3> GetAll015() { return infoMapper.getAll015(); }

    @Override
    public List<InfoBean3> GetAll016() { return infoMapper.getAll016(); }

    @Override
    public List<InfoBean3> GetAll017() { return infoMapper.getAll017(); }

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
}
