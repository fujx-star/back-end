package com.example.demo1.serviceimpl;

import com.example.demo1.bean.InfoBean;
import com.example.demo1.mapper.InfoMapper;
import com.example.demo1.service.InfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class InfoServiceImpl implements InfoService {
    @Resource
    private InfoMapper infoMapper;

    @Override
    public List<InfoBean> GetInfoByYear(Integer year) {
        return infoMapper.getInfo(year);
    }

    @Override
    public List<InfoBean> GetInfoByPv(String province) {
        return infoMapper.getInfo1(province);
    }

    @Override
    public List<InfoBean> GetInfoByPvandYear(Integer year, String province) {
        return infoMapper.getInfo2(year, province);
    }
}
