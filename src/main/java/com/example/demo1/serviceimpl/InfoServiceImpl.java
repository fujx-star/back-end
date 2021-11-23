package com.example.demo1.serviceimpl;

import com.example.demo1.bean.InfoBean;
import com.example.demo1.mapper.InfoMapper;
import com.example.demo1.service.InfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InfoServiceImpl implements InfoService {
    @Autowired
    private InfoMapper infoMapper;

    @Override
    public List<InfoBean> GetInfoByPv(String province){
        List<InfoBean> list = infoMapper.getInfo(province);
        return list;
    }

    @Override
    public List<InfoBean> GetInfoByYear(Integer year) {
        List<InfoBean> list = infoMapper.getInfo1(year);
        return list;
    }
}
