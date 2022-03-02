package com.zixuan.mybatisPlus.bean;

import com.baomidou.mybatisplus.annotation.*;

/**
 * author yjb
 * create 2021/11/25 - 14:04
 */
@TableName(value = "tbl_employee")
public class Employee {
    @TableId(value = "id",type = IdType.AUTO)
    private Integer id;
    @TableField(value = "last_name")
    private String lastName;
    private String email;
    @TableField(value = "gender",updateStrategy = FieldStrategy.IGNORED)
    private Integer gender;
    @TableField(value = "age",updateStrategy = FieldStrategy.IGNORED)
    private Integer age;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Employee() {
    }

    public Employee(Integer id, String lastName, String email, Integer gender, Integer age) {
        this.id = id;
        this.lastName = lastName;
        this.email = email;
        this.gender = gender;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                '}';
    }
}
