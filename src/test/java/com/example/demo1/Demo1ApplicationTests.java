package com.example.demo1;

import com.example.demo1.bean.InfoBean;
import com.example.demo1.bean.InfoBean4;
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

    }

}
