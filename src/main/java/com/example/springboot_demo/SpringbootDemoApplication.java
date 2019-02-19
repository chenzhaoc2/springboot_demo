package com.example.springboot_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;

@RestController
@SpringBootApplication
public class SpringbootDemoApplication {

    @RequestMapping("/")
    String index() {
        return "Hello Spring Boot";
    }
    @PostConstruct
    public void init() {
        System.out.println("TestConfiguration容器启动初始化。。。");
    }
    public static void main(String[] args) {
        SpringApplication.run(EsController.class, args);
    }

}

