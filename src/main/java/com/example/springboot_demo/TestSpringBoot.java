package com.example.springboot_demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestSpringBoot {

    @RequestMapping("/hello")
    public String getHello(){
        return "index";
    }
}
