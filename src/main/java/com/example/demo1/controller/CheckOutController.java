package com.example.demo1.controller;

import com.example.demo1.bean.InfoBean;
import com.example.demo1.service.InfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class CheckOutController {

    @Resource
    InfoService infoService;

//    @RequestMapping("/index")
//    public String sayhello(){
//        return "index";
//    }
//
//    @RequestMapping("/checkout")
//    public String show() {
//        return "checkout";
//    }

    @ResponseBody
    @RequestMapping(value = "baihan", method = RequestMethod.GET)
    public List<InfoBean> baihan(@RequestParam(value = "year")Integer year) {
        return infoService.GetInfoByYear(year);
    }

    @ResponseBody
    @RequestMapping(value = "huahua", method = RequestMethod.GET)
    public List<InfoBean> huahua(@RequestParam(value = "province")String province) {
        return infoService.GetInfoByPv(province);
    }

    @ResponseBody
    @RequestMapping(value = "jiaxin", method = RequestMethod.GET)
    public List<InfoBean> jiaxin(@RequestParam(value = "year")Integer year, @RequestParam(value = "province")String province) {
        return infoService.GetInfoByPvandYear(year, province);
    }
}
