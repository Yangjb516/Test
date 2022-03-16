package com.zixuan.springboot.controller;

import com.zixuan.springboot.bean.Person;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * author yjb
 * create 2022/3/16 - 22:16
 */
@RestController
@Slf4j
@RequestMapping("/person")
public class PersonController {

    @Autowired
    Person person;

    @RequestMapping("/yml")
    public Person yml() {
        return person;
    }
}
