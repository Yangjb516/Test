package com.zixuan.springboot.controller;

import com.zixuan.springboot.bean.Emp;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * author yjb
 * create 2022/3/15 - 23:02
 */
@RestController
@Slf4j
@RequestMapping("/emp")
public class EmpController {

    @RequestMapping("/hello")
    public String hello(@RequestParam("name") String name) {
        log.info("-----log:" + name);
        return "Hello," + name;
    }
    @RequestMapping("/hello2")
    public String hello2(@RequestBody Map<String,Object> map) {
        String name = String.valueOf(map.get("name"));
        log.info("-----log:" + name);
        return "Hello," + name;
    }
    @RequestMapping("/hello3")
    public String hello3(@RequestBody Map<String,Object> map) {
        String name = String.valueOf(map.get("name"));
        Emp emp = new Emp();
        emp.setEmpName(name);
        log.info("-----log:" + name);
        log.info("-----log:" + emp);
        return "Hello," + name;
    }
}
