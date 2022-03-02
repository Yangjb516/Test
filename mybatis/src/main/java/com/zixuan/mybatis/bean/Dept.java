package com.zixuan.mybatis.bean;


/**
 * author yjb
 * create 2021/9/27 - 14:30
 */
public class Dept {
    private String id;

    private String deptName;

    private  Integer deptCode;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public Integer getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(Integer deptCode) {
        this.deptCode = deptCode;
    }

    //不写toString，打印==:com.hbdmp.maven.bean.Dept@5f59ea8c
    //写toString，打印==:Dept{id='1', name='2', code=3}
    @Override
    public String toString() {
        return "Dept{" +
                "id='" + id + '\'' +
                ", deptName='" + deptName + '\'' +
                ", deptCode=" + deptCode +
                '}';
    }

    public Dept(String id, String deptName, Integer deptCode) {
        this.id = id;
        this.deptName = deptName;
        this.deptCode = deptCode;
    }

    public Dept() {
    }
}

