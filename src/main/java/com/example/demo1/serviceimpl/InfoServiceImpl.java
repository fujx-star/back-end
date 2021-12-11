package com.example.demo1.serviceimpl;

import com.example.demo1.bean.InfoBean;
import com.example.demo1.bean.InfoBean2;
import com.example.demo1.mapper.InfoMapper;
import com.example.demo1.service.InfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

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
    public String Get001(Integer year, String province) {
        return infoMapper.get001(year, province);
    }

    @Override
    public String Get002(Integer year, String province) {
        return infoMapper.get002(year, province);
    }

    @Override
    public String Get003(Integer year, String province) {
        return infoMapper.get003(year, province);
    }

    @Override
    public String Get004(Integer year, String province) {
        return infoMapper.get004(year, province);
    }

    @Override
    public String Get005(Integer year, String province) {
        return infoMapper.get005(year, province);
    }

    @Override
    public String Get006(Integer year, String province) {
        return infoMapper.get006(year, province);
    }

    @Override
    public String Get007(Integer year, String province) {
        return infoMapper.get007(year, province);
    }

    @Override
    public String Get008(Integer year, String province) {
        return infoMapper.get008(year, province);
    }

    @Override
    public String Get009(Integer year, String province) {
        return infoMapper.get009(year, province);
    }

    @Override
    public String Get010(Integer year, String province) {
        return infoMapper.get010(year, province);
    }

    @Override
    public String Get011(Integer year, String province) {
        return infoMapper.get011(year, province);
    }

    @Override
    public String Get012(Integer year, String province) {
        return infoMapper.get012(year, province);
    }

    @Override
    public String Get013(Integer year, String province) {
        return infoMapper.get013(year, province);
    }

    @Override
    public String Get014(Integer year, String province) {
        return infoMapper.get014(year, province);
    }

    @Override
    public String Get015(Integer year, String province) {
        return infoMapper.get015(year, province);
    }

    @Override
    public String Get016(Integer year, String province) {
        return infoMapper.get016(year, province);
    }

    @Override
    public String Get017(Integer year, String province) {
        return infoMapper.get017(year, province);
    }
}
