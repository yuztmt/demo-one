package com.example.demoone.hollo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.text.DateFormat;
import java.util.Date;

@Controller
public class Hello {
    @Value("${name}")
    private String name;
    @Value("${age}")
    private String age;
    @Value("${man}")
    private String Man;


    @RequestMapping("/hello")
    @ResponseBody
    public String sayHello(){
        return "hello";
    }

    @RequestMapping("/getMan")
    public String getMan(){
        return name+age;
    }

    @RequestMapping("/getMan2")
    public String getMan2(){
        return Man;
    }

    @RequestMapping("/helloWorld")
    public String helloWorld(HttpSession session){
        session.setAttribute("now", DateFormat.getDateTimeInstance().format(new Date()));
        return "helloWorld";
    }
}
