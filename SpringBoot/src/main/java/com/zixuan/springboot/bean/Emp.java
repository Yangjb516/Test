package com.zixuan.springboot.bean;

import lombok.*;

/**
 * author yjb
 * create 2022/3/15 - 22:59
 */
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Emp {
    private String empId;
    private String empName;
    private Integer empNumber;
}
