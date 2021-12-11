package com.example.demo1.controller;

import com.example.demo1.bean.InfoBean;
import com.example.demo1.bean.InfoBean2;
import com.example.demo1.service.InfoService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class MyController {

    @Resource
    InfoService infoService;

    @RequestMapping("checkout")
    public String checkout() {
        return "checkout";
    }

    @ResponseBody
    @RequestMapping(value = "jiaran")
    public List<InfoBean> jiaran() {
        return infoService.GetAllInfo();
    }

    @ResponseBody
    @RequestMapping(value = "baihan", method = RequestMethod.GET)
    public List<InfoBean> baihan(@RequestParam(value = "year")Integer year) {
        return infoService.GetInfoByYear(year);
    }

    @ResponseBody
    @RequestMapping(value = "huahua", method = RequestMethod.GET)
    public List<InfoBean> huahua(@RequestParam(value = "province")String province) {
        return infoService.GetInfoByProvince(province);
    }

    @ResponseBody
    @RequestMapping(value = "signin", method = RequestMethod.GET)
    public boolean signin(@RequestParam(value = "name")String name, @RequestParam(value = "password")String password) {
        return infoService.SignIn(name, password);
    }

    @ResponseBody
    @RequestMapping(value = "signup", method = RequestMethod.POST)
    public String signup(@RequestParam(value = "name")String name, @RequestParam(value = "password")String password, @RequestParam(value = "email")String email) {
        return infoService.SignUp(name, password, email);
    }

    @ResponseBody
    @RequestMapping(value = "aaa", method = RequestMethod.GET)
    public List<String> aaa(@RequestParam(value = "province")String province) {
        return infoService.GetCompanyByProvince(province);
    }

    @ResponseBody
    @RequestMapping(value = "bbb", method = RequestMethod.GET)
    public List<InfoBean2> bbb(@RequestParam(value = "province")String province, @RequestParam(value = "company")String company) {
        return infoService.GetWorkByPandC(province, company);
    }

    @ResponseBody
    @RequestMapping(value = "001", method = RequestMethod.GET)
    public String g001(@RequestParam(value = "year")Integer year, @RequestParam(value = "province")String province) {
        String result = infoService.Get001(year, province);
        return result == null?"您查询的数据不存在！":result;
    }

    @ResponseBody
    @RequestMapping(value = "002", method = RequestMethod.GET)
    public String g002(@RequestParam(value = "year")Integer year, @RequestParam(value = "province")String province) {
        String result = infoService.Get001(year, province);
        return result == null?"您查询的数据不存在！":result;
    }

    @ResponseBody
    @RequestMapping(value = "003", method = RequestMethod.GET)
    public String g003(@RequestParam(value = "year")Integer year, @RequestParam(value = "province")String province) {
        String result = infoService.Get001(year, province);
        return result == null?"您查询的数据不存在！":result;
    }

    @ResponseBody
    @RequestMapping(value = "004", method = RequestMethod.GET)
    public String g004(@RequestParam(value = "year")Integer year, @RequestParam(value = "province")String province) {
        String result = infoService.Get001(year, province);
        return result == null?"您查询的数据不存在！":result;
    }

    @ResponseBody
    @RequestMapping(value = "005", method = RequestMethod.GET)
    public String g005(@RequestParam(value = "year")Integer year, @RequestParam(value = "province")String province) {
        String result = infoService.Get001(year, province);
        return result == null?"您查询的数据不存在！":result;
    }

    @ResponseBody
    @RequestMapping(value = "006", method = RequestMethod.GET)
    public String g006(@RequestParam(value = "year")Integer year, @RequestParam(value = "province")String province) {
        String result = infoService.Get001(year, province);
        return result == null?"您查询的数据不存在！":result;
    }

    @ResponseBody
    @RequestMapping(value = "007", method = RequestMethod.GET)
    public String g007(@RequestParam(value = "year")Integer year, @RequestParam(value = "province")String province) {
        String result = infoService.Get001(year, province);
        return result == null?"您查询的数据不存在！":result;
    }

    @ResponseBody
    @RequestMapping(value = "008", method = RequestMethod.GET)
    public String g008(@RequestParam(value = "year")Integer year, @RequestParam(value = "province")String province) {
        String result = infoService.Get001(year, province);
        return result == null?"您查询的数据不存在！":result;
    }

    @ResponseBody
    @RequestMapping(value = "009", method = RequestMethod.GET)
    public String g009(@RequestParam(value = "year")Integer year, @RequestParam(value = "province")String province) {
        String result = infoService.Get001(year, province);
        return result == null?"您查询的数据不存在！":result;
    }

    @ResponseBody
    @RequestMapping(value = "010", method = RequestMethod.GET)
    public String g010(@RequestParam(value = "year")Integer year, @RequestParam(value = "province")String province) {
        String result = infoService.Get001(year, province);
        return result == null?"您查询的数据不存在！":result;
    }

    @ResponseBody
    @RequestMapping(value = "011", method = RequestMethod.GET)
    public String g011(@RequestParam(value = "year")Integer year, @RequestParam(value = "province")String province) {
        String result = infoService.Get001(year, province);
        return result == null?"您查询的数据不存在！":result;
    }

    @ResponseBody
    @RequestMapping(value = "012", method = RequestMethod.GET)
    public String g012(@RequestParam(value = "year")Integer year, @RequestParam(value = "province")String province) {
        String result = infoService.Get001(year, province);
        return result == null?"您查询的数据不存在！":result;
    }

    @ResponseBody
    @RequestMapping(value = "013", method = RequestMethod.GET)
    public String g013(@RequestParam(value = "year")Integer year, @RequestParam(value = "province")String province) {
        String result = infoService.Get001(year, province);
        return result == null?"您查询的数据不存在！":result;
    }

    @ResponseBody
    @RequestMapping(value = "014", method = RequestMethod.GET)
    public String g014(@RequestParam(value = "year")Integer year, @RequestParam(value = "province")String province) {
        String result = infoService.Get001(year, province);
        return result == null?"您查询的数据不存在！":result;
    }

    @ResponseBody
    @RequestMapping(value = "015", method = RequestMethod.GET)
    public String g015(@RequestParam(value = "year")Integer year, @RequestParam(value = "province")String province) {
        String result = infoService.Get001(year, province);
        return result == null?"您查询的数据不存在！":result;
    }

    @ResponseBody
    @RequestMapping(value = "016", method = RequestMethod.GET)
    public String g016(@RequestParam(value = "year")Integer year, @RequestParam(value = "province")String province) {
        String result = infoService.Get001(year, province);
        return result == null?"您查询的数据不存在！":result;
    }

    @ResponseBody
    @RequestMapping(value = "017", method = RequestMethod.GET)
    public String g017(@RequestParam(value = "year")Integer year, @RequestParam(value = "province")String province) {
        String result = infoService.Get001(year, province);
        return result == null?"您查询的数据不存在！":result;
    }
}
