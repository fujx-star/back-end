package com.example.demo1.serviceimpl;

import com.example.demo1.bean.InfoBean;
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
}
