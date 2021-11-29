package com.hbdmp.maven.mavendemo;

import com.hbdmp.maven.mapper.DeptMapper;
import com.hbdmp.maven.service.DeptService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SpringBootTest
class MavendemoApplicationTests {

    @Resource
    public DeptService deptService;

    @Resource
    public DeptMapper deptMapper;

//    @Test
//    public void testSelect() {
//        Dept dept = new Dept();
////        dept.setId(UUID.randomUUID().toString());
//        dept.setName("TEST"+ "-" + LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
//        deptMapper.insert(dept);
//
////        Dept dept = new Dept();
////        dept.setId("1");
////        deptMapper.deleteById(dept);
//        List<Dept> list = deptMapper.selectList(null);
////        Assert.assertEquals(5, userList.size());
////        list.forEach(System.out::println);
//        list.forEach((Dept t) -> System.out.println(t.getId() + "|" + t.getName()));
//    }


    //前端的字符串转list
    @Test
    public void testPoint() {
        String s = "1,2,3,4,5";
        String[] split = s.split(",");
        List<String> asList = Arrays.asList(split);
        for (String s1: asList) {
            System.out.println(s1);
        }
    }

//    @Test
//    public void testQueryWrapper(){
//        QueryWrapper<Dept> queryWrapper = new QueryWrapper<>();
//        queryWrapper.eq("name","CYS");
//        System.out.println(deptService.list(queryWrapper));
//    }

    @Test
    public void testT(){
        int a = 1;
        System.out.println(testTParam(a));
        String s = "yjb";
        System.out.println(testTParam(s));
    }

    //输入什么类型都可以。
    //？：表示不确定的 java 类型。
    //T (type)：表示具体的一个java类型。
    //K V (key value) 分别代表java键值中的Key Value。
    //E (element) ：代表Element，集合元素。
    private <T> T testTParam(T t){
        return t;
    }
}
