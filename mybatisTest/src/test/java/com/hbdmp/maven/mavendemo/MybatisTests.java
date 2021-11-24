package com.hbdmp.maven.mavendemo;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hbdmp.maven.bean.Dept;
import com.hbdmp.maven.mapper.DeptMapper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

/**
 * author yjb
 * create 2021/11/23 - 9:43
 */
@SpringBootTest
public class MybatisTests {
    @Resource
    public DeptMapper deptMapper;

    @Test
    public void testSelectResultType(){
        List<Dept> depts = deptMapper.getAllDeptResultType();
        for (Dept dept: depts) {
            System.out.println("==:"+dept);
        }
    }
    @Test
    public void testSelectResultMap(){
        List<Dept> depts = deptMapper.getAllDeptResultMap();
        for (Dept dept: depts) {
            System.out.println("==:"+dept);
        }
    }

    @Test
    public void TestInsert(){
        Dept dept = new Dept(null, "name", 1);
        Integer integer = deptMapper.insertDept(dept);
        System.out.println(integer);
        System.out.println(dept);
    }

    @Test
    public void TestInsertBatch(){
        for (int i=0;i<100;i++) {
            Dept dept = new Dept(null, "name"+i, 1);
            Integer integer = deptMapper.insertDept(dept);
        }
    }
    @Test
    public void TestPageHelper(){
        //仅需一行
        Page<Dept> page = PageHelper.startPage(5,2);
        List<Dept> depts = deptMapper.getAllDeptResultType();
        for (Dept dept: depts) {
            System.out.println("==:"+dept);
        }
        System.out.println(page);

        //分页导航
        PageInfo info = new PageInfo<>(depts,5) ;
        int[] nums = info.getNavigatepageNums();
        for (int i=0;i<nums.length;i++){
            System.out.println(nums[i]);
        }
    }
}
