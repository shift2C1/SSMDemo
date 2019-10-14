package com.test.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.sql.*;


@RequestMapping("/")
@Controller
public class testHandler {
    @ResponseBody
    @RequestMapping("/test")
    public String test(){
        return "index";
    }



}
