package com.zixuan.mybatis.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * author yjb
 * create 2021/9/30 - 16:00
 */

@RestController
@RequestMapping("/index")
public class Index {

    @GetMapping(value = "hello",produces = org.springframework.http.MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public String testhello(){
        String s = "-----hello-----";
        System.out.println(s);
        return s;
    }
}
