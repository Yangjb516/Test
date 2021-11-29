package com.hbdmp.maven.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.security.auth.login.Configuration;

/**
 * author yjb
 * create 2021/9/30 - 16:00
 */

@RestController("/index")
public class Index {

    @PostMapping("/test")
    public void testMyConfig(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
    }

    @GetMapping("/hello")
    public void testhello(){
        System.out.println("-----hello-----");
    }
    @GetMapping("/hello2")
    public void testhello2(){
        System.out.println("-----hello2-----");
    }
}
