package com.zixuan.springboot.bean;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * author yjb
 * create 2022/3/16 - 22:05
 */
//自定义的类和配置文件绑定，且以person开头
@ConfigurationProperties(prefix="person")
@Data
@Component
public class Person {
    private String userName;
    private Boolean boss;
    private Date birth;
    private Integer age;

    private Pet pet;

    private String[] interests;
    private List<String> animal;

    private Map<String,Object> score;
    private Set<Double> salarys;
    private Map<String,List<Pet>> allPets;
}
