package com.hbdmp.maven.mapper;

import com.hbdmp.maven.bean.Dept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * author yjb
 * create 2021/9/27 - 14:31
 */
@Mapper
public interface DeptMapper{
    public List<Dept> getAllDeptResultType();

    public List<Dept> getAllDeptResultMap();

    public Integer insertDept(Dept dept);
}
