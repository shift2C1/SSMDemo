package com.test.web;

import com.test.service.BumenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@RequestMapping("/")
@Controller
public class TestHandler {

    @Autowired
    private BumenService bumenService;

    @ResponseBody
    @RequestMapping("/test")
    public String test(){
        return "index";
    }

    @RequestMapping("/getBumenById")
    @ResponseBody
    public String getBumenById(String id){
        System.out.println(id);
        String s=bumenService.getBumenById(id);
        return s;
    }
}
