package com.example.demo1;

import com.example.demo1.bean.InfoBean;
import com.example.demo1.mapper.InfoMapper;
import com.example.demo1.service.InfoService;
import com.example.demo1.serviceimpl.InfoServiceImpl;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
class Demo1ApplicationTests {

    @Resource
    InfoService infoService;

    @Test
    void contextLoads() {
        List<InfoBean> list = infoService.GetInfoByPvandYear(2011,"安徽省");
        for(InfoBean li:list) {
            System.out.println(li.getId());
            System.out.println(li.getYear());
            System.out.println(li.getProvince());
            System.out.println(li.getEnterprise());
            System.out.println(li.getEmployee());
            System.out.println(li.getSalary());
        }
    }

}
