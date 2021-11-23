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

import java.util.List;

@Controller
public class CheckOutController {

    @Autowired
    InfoService infoService;

    @RequestMapping("/index")
    public String sayhello(){
        return "index";
    }

    @RequestMapping("/checkout")
    public String show() {
        return "checkout";
    }

    @ResponseBody
    @RequestMapping(value = "huahua", method = RequestMethod.GET)
    public List<InfoBean> huahua(@RequestParam(value = "province")String province) {
        List<InfoBean> list = infoService.GetInfoByPv(province);
//        for(InfoBean li:list) {
//            System.out.println("id:"+li.getId());
//            System.out.println("year:"+li.getYear());
//            System.out.println("enterprise:"+li.getEnterprise());
//            System.out.println("employee:"+li.getEmployee());
//            System.out.println("salary:"+li.getSalary());
//        }
        return list;
    }

    @RequestMapping(value = "baihan", method = RequestMethod.GET)
    public String baihan(@RequestParam(value = "year")Integer year, Model model) {
        List<InfoBean> list = infoService.GetInfoByYear(year);
        model.addAttribute("data", list);
        return "show";
//        return list;
    }
}
