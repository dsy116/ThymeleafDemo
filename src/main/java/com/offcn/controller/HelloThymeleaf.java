package com.offcn.controller;

import com.offcn.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.*;

@Controller
public class HelloThymeleaf {

    @GetMapping("/hello")
    public String helloPage(Model model){
        model.addAttribute("msg","今天10月29日");
        return "hello";
    }

    @GetMapping("/getUser")
    public String getUser(Model model){
        User user = new User(2020001, 12, "小白");
        model.addAttribute("user",user);

        Map<String, String> map = new HashMap<>();
        map.put("phoneNum","13412341234");
        map.put("address","成都市双流区");
        model.addAttribute("map",map);

        return "showUser";
    }

    @GetMapping("/showList")
    public String showList(Model model){
        List<User> list = new ArrayList<>();
        list.add(new User(2020002,16,"小白"));
        list.add(new User(2020003,17,"小白1"));
        list.add(new User(2020004,18,"小白2"));
        list.add(new User(2020005,19,"小白3"));
        model.addAttribute("list",list);

        model.addAttribute("username","小花");

        return "list";
    }

    @GetMapping("/showIsOrNot")
    public String showIsOrNot(Model model){
        model.addAttribute("flag","no");
        return "yesOrNot";
    }

    @GetMapping("/showSwitch")
    public String showSwitch(Model model){
        model.addAttribute("auth","admin");
        model.addAttribute("manager","manager");
        return "showSwitch";
    }

    @GetMapping("/showImage")
    public String showImage(){
        return "showImage";
    }

    @GetMapping("showIndex")
    public String showIndex(){
        return "showFragment";
    }

    @GetMapping("/showInnerObject")
    public String showInnerObject(Model model){
        model.addAttribute("date",new Date());
        model.addAttribute("price",12345.789D);
        model.addAttribute("str","世界很复杂，百度更懂你”，百度百科旨在创造一个涵盖各领域知识的中文信息收集平台。百度百科强调用户的参与和奉献精神，充分调动互联网用户的力量，汇聚上亿用户的头脑智慧，积极进行交流和分享。同时，百度百科实现与百度搜索、百度知道的结合，从不同的层次上满足用户对信息的需求。“世界很复杂，百度更懂你”，百度百科旨在创造一个涵盖各领域知识的中文信息收集平台。百度百科强调用户的参与和奉献精神，充分调动互联网用户的力量，汇聚上亿用户的头脑智慧，积极进行交流和分享。同时，百度百科实现与百度搜索、百度知道的结合，从不同的层次上满足用户对信息的需求。");
        return "showInnerObj";
    }
}
