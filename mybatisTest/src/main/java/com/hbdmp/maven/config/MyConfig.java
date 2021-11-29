package com.hbdmp.maven.config;

/**
 * author yjb
 * create 2021/11/26 - 9:22
 */
public class MyConfig {
    private String name;
    private String code;

    public MyConfig() {
        System.out.println("-----MyConfig:MyConfig()-----");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
