package com.zixuan.mybatisPlus.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.zixuan.mybatisPlus.bean.Employee;
import org.apache.ibatis.annotations.Mapper;

/**
 * author yjb
 * create 2021/11/25 - 14:07
 */
@Mapper
public interface EmployeeMapper extends BaseMapper<Employee> {
    IPage<Employee> selctPageVo(Page<Employee> page, String lastName);
}
