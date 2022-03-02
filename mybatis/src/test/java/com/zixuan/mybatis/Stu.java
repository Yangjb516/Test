package com.zixuan.mybatis;

/**
 * author yjb
 * create 2022/2/9 - 10:57
 */
public class Stu {
    private String name;
    private String code;

    public Stu(String name,String code){
        this.name = name;
        this.code = code;
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

    @Override
    public String toString() {
        return "Stu{" +
                "name='" + name + '\'' +
                ", code='" + code + '\'' +
                '}';
    }
}
