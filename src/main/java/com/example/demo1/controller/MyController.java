package com.example.demo1.controller;

import com.alibaba.fastjson.JSONArray;
import com.example.demo1.bean.InfoBean;
import com.example.demo1.bean.InfoBean2;
import com.example.demo1.bean.InfoBean3;
import com.example.demo1.bean.InfoBean4;
import com.example.demo1.service.InfoService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Controller
public class MyController {

    @Resource
    InfoService infoService;

    @RequestMapping("checkout")
    public String checkout() {
        return "checkout";
    }

    @ResponseBody
    @RequestMapping(value = "jiaran1")
    public List<JSONArray> jiaran1() {
        return infoService.GetAllInfo1();
    }

    @ResponseBody
    @RequestMapping(value = "jiaran2")
    public List<JSONArray> jiaran2() {
        return infoService.GetAllInfo2();
    }

    @ResponseBody
    @RequestMapping(value = "jiaran3")
    public List<JSONArray> jiaran3() {
        return infoService.GetAllInfo3();
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
    public List<InfoBean2> bbb(@RequestParam(value = "province")String province) {
        return infoService.GetWorkByProvince(province);
    }

    @ResponseBody
    @RequestMapping(value = "ccc", method = RequestMethod.GET)
    public List<InfoBean2> ccc(@RequestParam(value = "province")String province, @RequestParam(value = "company")String company) {
        return infoService.GetWorkByPandC(province, company);
    }

    @ResponseBody
    @RequestMapping(value = "all001", method = RequestMethod.GET)
    public List<JSONArray> all001() {
        return infoService.GetAll001();
    }

    @ResponseBody
    @RequestMapping(value = "year001", method = RequestMethod.GET)
    public List<InfoBean3> year001(@RequestParam(value = "year")int year) {
        return infoService.GetByYear001(year);
    }

    @ResponseBody
    @RequestMapping(value = "province001", method = RequestMethod.GET)
    public List<InfoBean3> province001(@RequestParam(value = "province")String province) {
        return infoService.GetByProvince001(province);
    }

    @ResponseBody
    @RequestMapping(value = "001", method = RequestMethod.GET)
    public String g001(@RequestParam(value = "year")Integer year, @RequestParam(value = "province")String province) {
        String result = infoService.Get001(year, province);
        return result == null?"??????????????????????????????":result;
    }

    @ResponseBody
    @RequestMapping(value = "all002", method = RequestMethod.GET)
    public List<JSONArray> all002() {
        return infoService.GetAll002();
    }

    @ResponseBody
    @RequestMapping(value = "year002", method = RequestMethod.GET)
    public List<InfoBean3> year002(@RequestParam(value = "year")int year) {
        return infoService.GetByYear002(year);
    }

    @ResponseBody
    @RequestMapping(value = "province002", method = RequestMethod.GET)
    public List<InfoBean3> province002(@RequestParam(value = "province")String province) {
        return infoService.GetByProvince002(province);
    }

    @ResponseBody
    @RequestMapping(value = "002", method = RequestMethod.GET)
    public String g002(@RequestParam(value = "year")Integer year, @RequestParam(value = "province")String province) {
        String result = infoService.Get002(year, province);
        return result == null?"??????????????????????????????":result;
    }

    @ResponseBody
    @RequestMapping(value = "all003", method = RequestMethod.GET)
    public List<JSONArray>  all003() {
        return infoService.GetAll003();
    }

    @ResponseBody
    @RequestMapping(value = "year003", method = RequestMethod.GET)
    public List<InfoBean3> year003(@RequestParam(value = "year")int year) {
        return infoService.GetByYear003(year);
    }

    @ResponseBody
    @RequestMapping(value = "province003", method = RequestMethod.GET)
    public List<InfoBean3> province003(@RequestParam(value = "province")String province) {
        return infoService.GetByProvince003(province);
    }

    @ResponseBody
    @RequestMapping(value = "003", method = RequestMethod.GET)
    public String g003(@RequestParam(value = "year")Integer year, @RequestParam(value = "province")String province) {
        String result = infoService.Get003(year, province);
        return result == null?"??????????????????????????????":result;
    }

    @ResponseBody
    @RequestMapping(value = "all004", method = RequestMethod.GET)
    public List<JSONArray> all004() {
        return infoService.GetAll004();
    }

    @ResponseBody
    @RequestMapping(value = "year004", method = RequestMethod.GET)
    public List<InfoBean3> year004(@RequestParam(value = "year")int year) {
        return infoService.GetByYear004(year);
    }

    @ResponseBody
    @RequestMapping(value = "province004", method = RequestMethod.GET)
    public List<InfoBean3> province004(@RequestParam(value = "province")String province) {
        return infoService.GetByProvince004(province);
    }

    @ResponseBody
    @RequestMapping(value = "004", method = RequestMethod.GET)
    public String g004(@RequestParam(value = "year")Integer year, @RequestParam(value = "province")String province) {
        String result = infoService.Get004(year, province);
        return result == null?"??????????????????????????????":result;
    }

    @ResponseBody
    @RequestMapping(value = "all005", method = RequestMethod.GET)
    public List<JSONArray> all005() {
        return infoService.GetAll005();
    }

    @ResponseBody
    @RequestMapping(value = "year005", method = RequestMethod.GET)
    public List<InfoBean3> year005(@RequestParam(value = "year")int year) {
        return infoService.GetByYear005(year);
    }

    @ResponseBody
    @RequestMapping(value = "province005", method = RequestMethod.GET)
    public List<InfoBean3> province005(@RequestParam(value = "province")String province) {
        return infoService.GetByProvince005(province);
    }

    @ResponseBody
    @RequestMapping(value = "005", method = RequestMethod.GET)
    public String g005(@RequestParam(value = "year")Integer year, @RequestParam(value = "province")String province) {
        String result = infoService.Get005(year, province);
        return result == null?"??????????????????????????????":result;
    }

    @ResponseBody
    @RequestMapping(value = "all006", method = RequestMethod.GET)
    public List<JSONArray> all006() {
        return infoService.GetAll006();
    }

    @ResponseBody
    @RequestMapping(value = "year006", method = RequestMethod.GET)
    public List<InfoBean3> year006(@RequestParam(value = "year")int year) {
        return infoService.GetByYear006(year);
    }

    @ResponseBody
    @RequestMapping(value = "province006", method = RequestMethod.GET)
    public List<InfoBean3> province006(@RequestParam(value = "province")String province) {
        return infoService.GetByProvince006(province);
    }

    @ResponseBody
    @RequestMapping(value = "006", method = RequestMethod.GET)
    public String g006(@RequestParam(value = "year")Integer year, @RequestParam(value = "province")String province) {
        String result = infoService.Get006(year, province);
        return result == null?"??????????????????????????????":result;
    }

    @ResponseBody
    @RequestMapping(value = "all007", method = RequestMethod.GET)
    public List<JSONArray> all007() {
        return infoService.GetAll007();
    }

    @ResponseBody
    @RequestMapping(value = "year007", method = RequestMethod.GET)
    public List<InfoBean3> year007(@RequestParam(value = "year")int year) {
        return infoService.GetByYear007(year);
    }

    @ResponseBody
    @RequestMapping(value = "province007", method = RequestMethod.GET)
    public List<InfoBean3> province007(@RequestParam(value = "province")String province) {
        return infoService.GetByProvince007(province);
    }

    @ResponseBody
    @RequestMapping(value = "007", method = RequestMethod.GET)
    public String g007(@RequestParam(value = "year")Integer year, @RequestParam(value = "province")String province) {
        String result = infoService.Get007(year, province);
        return result == null?"??????????????????????????????":result;
    }

    @ResponseBody
    @RequestMapping(value = "all008", method = RequestMethod.GET)
    public List<JSONArray> all008() {
        return infoService.GetAll008();
    }

    @ResponseBody
    @RequestMapping(value = "year008", method = RequestMethod.GET)
    public List<InfoBean3> year008(@RequestParam(value = "year")int year) {
        return infoService.GetByYear008(year);
    }

    @ResponseBody
    @RequestMapping(value = "province008", method = RequestMethod.GET)
    public List<InfoBean3> province008(@RequestParam(value = "province")String province) {
        return infoService.GetByProvince008(province);
    }

    @ResponseBody
    @RequestMapping(value = "008", method = RequestMethod.GET)
    public String g008(@RequestParam(value = "year")Integer year, @RequestParam(value = "province")String province) {
        String result = infoService.Get008(year, province);
        return result == null?"??????????????????????????????":result;
    }

    @ResponseBody
    @RequestMapping(value = "all009", method = RequestMethod.GET)
    public List<JSONArray> all009() {
        return infoService.GetAll009();
    }

    @ResponseBody
    @RequestMapping(value = "year009", method = RequestMethod.GET)
    public List<InfoBean3> year009(@RequestParam(value = "year")int year) {
        return infoService.GetByYear009(year);
    }

    @ResponseBody
    @RequestMapping(value = "province009", method = RequestMethod.GET)
    public List<InfoBean3> province009(@RequestParam(value = "province")String province) {
        return infoService.GetByProvince009(province);
    }

    @ResponseBody
    @RequestMapping(value = "009", method = RequestMethod.GET)
    public String g009(@RequestParam(value = "year")Integer year, @RequestParam(value = "province")String province) {
        String result = infoService.Get009(year, province);
        return result == null?"??????????????????????????????":result;
    }

    @ResponseBody
    @RequestMapping(value = "all010", method = RequestMethod.GET)
    public List<JSONArray> all010() {
        return infoService.GetAll010();
    }

    @ResponseBody
    @RequestMapping(value = "year010", method = RequestMethod.GET)
    public List<InfoBean3> year010(@RequestParam(value = "year")int year) {
        return infoService.GetByYear010(year);
    }

    @ResponseBody
    @RequestMapping(value = "province010", method = RequestMethod.GET)
    public List<InfoBean3> province010(@RequestParam(value = "province")String province) {
        return infoService.GetByProvince010(province);
    }

    @ResponseBody
    @RequestMapping(value = "010", method = RequestMethod.GET)
    public String g010(@RequestParam(value = "year")Integer year, @RequestParam(value = "province")String province) {
        String result = infoService.Get010(year, province);
        return result == null?"??????????????????????????????":result;
    }

    @ResponseBody
    @RequestMapping(value = "all011", method = RequestMethod.GET)
    public List<JSONArray> all011() {
        return infoService.GetAll011();
    }

    @ResponseBody
    @RequestMapping(value = "year011", method = RequestMethod.GET)
    public List<InfoBean3> year011(@RequestParam(value = "year")int year) {
        return infoService.GetByYear011(year);
    }

    @ResponseBody
    @RequestMapping(value = "province011", method = RequestMethod.GET)
    public List<InfoBean3> province011(@RequestParam(value = "province")String province) {
        return infoService.GetByProvince011(province);
    }

    @ResponseBody
    @RequestMapping(value = "011", method = RequestMethod.GET)
    public String g011(@RequestParam(value = "year")Integer year, @RequestParam(value = "province")String province) {
        String result = infoService.Get011(year, province);
        return result == null?"??????????????????????????????":result;
    }

    @ResponseBody
    @RequestMapping(value = "all012", method = RequestMethod.GET)
    public List<JSONArray> all012() {
        return infoService.GetAll012();
    }

    @ResponseBody
    @RequestMapping(value = "year012", method = RequestMethod.GET)
    public List<InfoBean3> year012(@RequestParam(value = "year")int year) {
        return infoService.GetByYear012(year);
    }

    @ResponseBody
    @RequestMapping(value = "province012", method = RequestMethod.GET)
    public List<InfoBean3> province012(@RequestParam(value = "province")String province) {
        return infoService.GetByProvince012(province);
    }

    @ResponseBody
    @RequestMapping(value = "012", method = RequestMethod.GET)
    public String g012(@RequestParam(value = "year")Integer year, @RequestParam(value = "province")String province) {
        String result = infoService.Get012(year, province);
        return result == null?"??????????????????????????????":result;
    }

    @ResponseBody
    @RequestMapping(value = "all013", method = RequestMethod.GET)
    public List<JSONArray> all013() {
        return infoService.GetAll013();
    }

    @ResponseBody
    @RequestMapping(value = "year013", method = RequestMethod.GET)
    public List<InfoBean3> year013(@RequestParam(value = "year")int year) {
        return infoService.GetByYear013(year);
    }

    @ResponseBody
    @RequestMapping(value = "province013", method = RequestMethod.GET)
    public List<InfoBean3> province013(@RequestParam(value = "province")String province) {
        return infoService.GetByProvince013(province);
    }

    @ResponseBody
    @RequestMapping(value = "013", method = RequestMethod.GET)
    public String g013(@RequestParam(value = "year")Integer year, @RequestParam(value = "province")String province) {
        String result = infoService.Get013(year, province);
        return result == null?"??????????????????????????????":result;
    }

    @ResponseBody
    @RequestMapping(value = "all014", method = RequestMethod.GET)
    public List<JSONArray> all014() {
        return infoService.GetAll014();
    }

    @ResponseBody
    @RequestMapping(value = "year014", method = RequestMethod.GET)
    public List<InfoBean3> year014(@RequestParam(value = "year")int year) {
        return infoService.GetByYear014(year);
    }

    @ResponseBody
    @RequestMapping(value = "province014", method = RequestMethod.GET)
    public List<InfoBean3> province014(@RequestParam(value = "province")String province) {
        return infoService.GetByProvince014(province);
    }

    @ResponseBody
    @RequestMapping(value = "014", method = RequestMethod.GET)
    public String g014(@RequestParam(value = "year")Integer year, @RequestParam(value = "province")String province) {
        String result = infoService.Get014(year, province);
        return result == null?"??????????????????????????????":result;
    }

    @ResponseBody
    @RequestMapping(value = "all015", method = RequestMethod.GET)
    public List<JSONArray> all015() {
        return infoService.GetAll015();
    }

    @ResponseBody
    @RequestMapping(value = "year015", method = RequestMethod.GET)
    public List<InfoBean3> year015(@RequestParam(value = "year")int year) {
        return infoService.GetByYear015(year);
    }

    @ResponseBody
    @RequestMapping(value = "province015", method = RequestMethod.GET)
    public List<InfoBean3> province015(@RequestParam(value = "province")String province) {
        return infoService.GetByProvince015(province);
    }

    @ResponseBody
    @RequestMapping(value = "015", method = RequestMethod.GET)
    public String g015(@RequestParam(value = "year")Integer year, @RequestParam(value = "province")String province) {
        String result = infoService.Get015(year, province);
        return result == null?"??????????????????????????????":result;
    }

    @ResponseBody
    @RequestMapping(value = "all016", method = RequestMethod.GET)
    public List<JSONArray> all016() {
        return infoService.GetAll016();
    }

    @ResponseBody
    @RequestMapping(value = "year016", method = RequestMethod.GET)
    public List<InfoBean3> year016(@RequestParam(value = "year")int year) {
        return infoService.GetByYear016(year);
    }

    @ResponseBody
    @RequestMapping(value = "province016", method = RequestMethod.GET)
    public List<InfoBean3> province016(@RequestParam(value = "province")String province) {
        return infoService.GetByProvince016(province);
    }

    @ResponseBody
    @RequestMapping(value = "016", method = RequestMethod.GET)
    public String g016(@RequestParam(value = "year")Integer year, @RequestParam(value = "province")String province) {
        String result = infoService.Get016(year, province);
        return result == null?"??????????????????????????????":result;
    }

    @ResponseBody
    @RequestMapping(value = "all017", method = RequestMethod.GET)
    public List<JSONArray> all017() {
        return infoService.GetAll017();
    }

    @ResponseBody
    @RequestMapping(value = "year017", method = RequestMethod.GET)
    public List<InfoBean3> year017(@RequestParam(value = "year")int year) {
        return infoService.GetByYear017(year);
    }

    @ResponseBody
    @RequestMapping(value = "province017", method = RequestMethod.GET)
    public List<InfoBean3> province017(@RequestParam(value = "province")String province) {
        return infoService.GetByProvince017(province);
    }

    @ResponseBody
    @RequestMapping(value = "017", method = RequestMethod.GET)
    public String g017(@RequestParam(value = "year")Integer year, @RequestParam(value = "province")String province) {
        String result = infoService.Get017(year, province);
        return result == null?"??????????????????????????????":result;
    }

    @ResponseBody
    @RequestMapping(value = "allmei001", method = RequestMethod.GET)
    public List<JSONArray> allmei001() {
        return infoService.GetAllMei001();
    }

    @ResponseBody
    @RequestMapping(value = "yearmei001", method = RequestMethod.GET)
    public List<InfoBean3> yearmei001(@RequestParam(value = "year")int year) {
        return infoService.GetByYearMei001(year);
    }

    @ResponseBody
    @RequestMapping(value = "provincemei001", method = RequestMethod.GET)
    public List<InfoBean3> provincemei001(@RequestParam(value = "province")String province) {
        return infoService.GetByProvinceMei001(province);
    }

    @ResponseBody
    @RequestMapping(value = "mei001", method = RequestMethod.GET)
    public String gmei001(@RequestParam(value = "year")Integer year, @RequestParam(value = "province")String province) {
        String result = infoService.GetMei001(year, province);
        return result == null?"??????????????????????????????":result;
    }

    @ResponseBody
    @RequestMapping(value = "allmei002", method = RequestMethod.GET)
    public List<JSONArray> allmei002() {
        return infoService.GetAllMei002();
    }

    @ResponseBody
    @RequestMapping(value = "yearmei002", method = RequestMethod.GET)
    public List<InfoBean3> yearmei002(@RequestParam(value = "year")int year) {
        return infoService.GetByYearMei002(year);
    }

    @ResponseBody
    @RequestMapping(value = "provincemei002", method = RequestMethod.GET)
    public List<InfoBean3> provincemei002(@RequestParam(value = "province")String province) {
        return infoService.GetByProvinceMei002(province);
    }

    @ResponseBody
    @RequestMapping(value = "mei002", method = RequestMethod.GET)
    public String gmei002(@RequestParam(value = "year")Integer year, @RequestParam(value = "province")String province) {
        String result = infoService.GetMei002(year, province);
        return result == null?"??????????????????????????????":result;
    }

    @ResponseBody
    @RequestMapping(value = "allmei003", method = RequestMethod.GET)
    public List<JSONArray>  allmei003() {
        return infoService.GetAllMei003();
    }

    @ResponseBody
    @RequestMapping(value = "yearmei003", method = RequestMethod.GET)
    public List<InfoBean3> yearmei003(@RequestParam(value = "year")int year) {
        return infoService.GetByYearMei003(year);
    }

    @ResponseBody
    @RequestMapping(value = "provincemei003", method = RequestMethod.GET)
    public List<InfoBean3> provincemei003(@RequestParam(value = "province")String province) {
        return infoService.GetByProvinceMei003(province);
    }

    @ResponseBody
    @RequestMapping(value = "mei003", method = RequestMethod.GET)
    public String gmei003(@RequestParam(value = "year")Integer year, @RequestParam(value = "province")String province) {
        String result = infoService.GetMei003(year, province);
        return result == null?"??????????????????????????????":result;
    }

    @ResponseBody
    @RequestMapping(value = "allmei004", method = RequestMethod.GET)
    public List<JSONArray> allmei004() {
        return infoService.GetAllMei004();
    }

    @ResponseBody
    @RequestMapping(value = "yearmei004", method = RequestMethod.GET)
    public List<InfoBean3> yearmei004(@RequestParam(value = "year")int year) {
        return infoService.GetByYearMei004(year);
    }

    @ResponseBody
    @RequestMapping(value = "provincemei004", method = RequestMethod.GET)
    public List<InfoBean3> provincemei004(@RequestParam(value = "province")String province) {
        return infoService.GetByProvinceMei004(province);
    }

    @ResponseBody
    @RequestMapping(value = "mei004", method = RequestMethod.GET)
    public String gmei004(@RequestParam(value = "year")Integer year, @RequestParam(value = "province")String province) {
        String result = infoService.GetMei004(year, province);
        return result == null?"??????????????????????????????":result;
    }

    @ResponseBody
    @RequestMapping(value = "allying001", method = RequestMethod.GET)
    public List<JSONArray> allying001() {
        return infoService.GetAllYing001();
    }

    @ResponseBody
    @RequestMapping(value = "yearying001", method = RequestMethod.GET)
    public List<InfoBean3> yearying001(@RequestParam(value = "year")int year) {
        return infoService.GetByYearYing001(year);
    }

    @ResponseBody
    @RequestMapping(value = "provinceying001", method = RequestMethod.GET)
    public List<InfoBean3> provinceying001(@RequestParam(value = "province")String province) {
        return infoService.GetByProvinceYing001(province);
    }

    @ResponseBody
    @RequestMapping(value = "ying001", method = RequestMethod.GET)
    public String gying001(@RequestParam(value = "year")Integer year, @RequestParam(value = "province")String province) {
        String result = infoService.GetYing001(year, province);
        return result == null?"??????????????????????????????":result;
    }

    @ResponseBody
    @RequestMapping(value = "allying002", method = RequestMethod.GET)
    public List<JSONArray> allying002() {
        return infoService.GetAllYing002();
    }

    @ResponseBody
    @RequestMapping(value = "yearying002", method = RequestMethod.GET)
    public List<InfoBean3> yearying002(@RequestParam(value = "year")int year) {
        return infoService.GetByYearYing002(year);
    }

    @ResponseBody
    @RequestMapping(value = "provinceying002", method = RequestMethod.GET)
    public List<InfoBean3> provinceying002(@RequestParam(value = "province")String province) {
        return infoService.GetByProvinceYing002(province);
    }

    @ResponseBody
    @RequestMapping(value = "ying002", method = RequestMethod.GET)
    public String gying002(@RequestParam(value = "year")Integer year, @RequestParam(value = "province")String province) {
        String result = infoService.GetYing002(year, province);
        return result == null?"??????????????????????????????":result;
    }

    @ResponseBody
    @RequestMapping(value = "allying003", method = RequestMethod.GET)
    public List<JSONArray>  allying003() {
        return infoService.GetAllYing003();
    }

    @ResponseBody
    @RequestMapping(value = "yearying003", method = RequestMethod.GET)
    public List<InfoBean3> yearying003(@RequestParam(value = "year")int year) {
        return infoService.GetByYearYing003(year);
    }

    @ResponseBody
    @RequestMapping(value = "provinceying003", method = RequestMethod.GET)
    public List<InfoBean3> provinceying003(@RequestParam(value = "province")String province) {
        return infoService.GetByProvinceYing003(province);
    }

    @ResponseBody
    @RequestMapping(value = "ying003", method = RequestMethod.GET)
    public String gying003(@RequestParam(value = "year")Integer year, @RequestParam(value = "province")String province) {
        String result = infoService.GetYing003(year, province);
        return result == null?"??????????????????????????????":result;
    }

    @ResponseBody
    @RequestMapping(value = "allying004", method = RequestMethod.GET)
    public List<JSONArray> allying004() {
        return infoService.GetAllYing004();
    }

    @ResponseBody
    @RequestMapping(value = "yearying004", method = RequestMethod.GET)
    public List<InfoBean3> yearying004(@RequestParam(value = "year")int year) {
        return infoService.GetByYearYing004(year);
    }

    @ResponseBody
    @RequestMapping(value = "provinceying004", method = RequestMethod.GET)
    public List<InfoBean3> provinceying004(@RequestParam(value = "province")String province) {
        return infoService.GetByProvinceYing004(province);
    }

    @ResponseBody
    @RequestMapping(value = "ying004", method = RequestMethod.GET)
    public String gying004(@RequestParam(value = "year")Integer year, @RequestParam(value = "province")String province) {
        String result = infoService.GetYing004(year, province);
        return result == null?"??????????????????????????????":result;
    }

    @ResponseBody
    @RequestMapping(value = "alle001", method = RequestMethod.GET)
    public List<JSONArray> alle001() {
        return infoService.GetAllE001();
    }

    @ResponseBody
    @RequestMapping(value = "yeare001", method = RequestMethod.GET)
    public List<InfoBean3> yeare001(@RequestParam(value = "year")int year) {
        return infoService.GetByYearE001(year);
    }

    @ResponseBody
    @RequestMapping(value = "provincee001", method = RequestMethod.GET)
    public List<InfoBean3> provincee001(@RequestParam(value = "province")String province) {
        return infoService.GetByProvinceE001(province);
    }

    @ResponseBody
    @RequestMapping(value = "e001", method = RequestMethod.GET)
    public String ge001(@RequestParam(value = "year")Integer year, @RequestParam(value = "province")String province) {
        String result = infoService.GetE001(year, province);
        return result == null?"??????????????????????????????":result;
    }

    @ResponseBody
    @RequestMapping(value = "alle002", method = RequestMethod.GET)
    public List<JSONArray> alle002() {
        return infoService.GetAllE002();
    }

    @ResponseBody
    @RequestMapping(value = "yeare002", method = RequestMethod.GET)
    public List<InfoBean3> yeare002(@RequestParam(value = "year")int year) {
        return infoService.GetByYearE002(year);
    }

    @ResponseBody
    @RequestMapping(value = "provincee002", method = RequestMethod.GET)
    public List<InfoBean3> provincee002(@RequestParam(value = "province")String province) {
        return infoService.GetByProvinceE002(province);
    }

    @ResponseBody
    @RequestMapping(value = "e002", method = RequestMethod.GET)
    public String ge002(@RequestParam(value = "year")Integer year, @RequestParam(value = "province")String province) {
        String result = infoService.GetE002(year, province);
        return result == null?"??????????????????????????????":result;
    }

    @ResponseBody
    @RequestMapping(value = "alle003", method = RequestMethod.GET)
    public List<JSONArray>  alle003() {
        return infoService.GetAllE003();
    }

    @ResponseBody
    @RequestMapping(value = "yeare003", method = RequestMethod.GET)
    public List<InfoBean3> yeare003(@RequestParam(value = "year")int year) {
        return infoService.GetByYearE003(year);
    }

    @ResponseBody
    @RequestMapping(value = "provincee003", method = RequestMethod.GET)
    public List<InfoBean3> provincee003(@RequestParam(value = "province")String province) {
        return infoService.GetByProvinceE003(province);
    }

    @ResponseBody
    @RequestMapping(value = "e003", method = RequestMethod.GET)
    public String ge003(@RequestParam(value = "year")Integer year, @RequestParam(value = "province")String province) {
        String result = infoService.GetE003(year, province);
        return result == null?"??????????????????????????????":result;
    }

    @ResponseBody
    @RequestMapping(value = "alle004", method = RequestMethod.GET)
    public List<JSONArray> alle004() {
        return infoService.GetAllE004();
    }

    @ResponseBody
    @RequestMapping(value = "yeare004", method = RequestMethod.GET)
    public List<InfoBean3> yeare004(@RequestParam(value = "year")int year) {
        return infoService.GetByYearE004(year);
    }

    @ResponseBody
    @RequestMapping(value = "provincee004", method = RequestMethod.GET)
    public List<InfoBean3> provincee004(@RequestParam(value = "province")String province) {
        return infoService.GetByProvinceE004(province);
    }

    @ResponseBody
    @RequestMapping(value = "e004", method = RequestMethod.GET)
    public String ge004(@RequestParam(value = "year")Integer year, @RequestParam(value = "province")String province) {
        String result = infoService.GetE004(year, province);
        return result == null?"??????????????????????????????":result;
    }


}
