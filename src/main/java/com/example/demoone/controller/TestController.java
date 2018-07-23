package com.example.demoone.controller;

import com.example.demoone.mapper.UserManager;
import com.example.demoone.pojo.IService.IUserService;
import com.example.demoone.pojo.TUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class TestController {
    @Autowired
    private IUserService userService;

    @RequestMapping("/index")
    public String index(){
        return "index";
    }
    @RequestMapping("/getUserList")
    @ResponseBody
    public List<TUser> getUserList(){
        return userService.getUserList();
    }
}
