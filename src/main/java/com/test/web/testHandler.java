package com.test.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@RequestMapping("/")
@Controller
public class testHandler {

    @ResponseBody
    @RequestMapping("/test")
    public String test(){
        return "index";
    }

    @RequestMapping("/getBumenById")
    @ResponseBody
    public String getBumenById(String id){
        System.out.println(id);
        return "";
    }
}
