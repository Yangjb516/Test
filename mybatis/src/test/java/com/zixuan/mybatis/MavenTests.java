package com.zixuan.mybatis;

import com.zixuan.util.MyStringUtil;
import org.apache.commons.collections4.CollectionUtils;
import org.junit.jupiter.api.Test;
import org.junit.platform.commons.util.StringUtils;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * author yjb
 * create 2021/11/23 - 9:43
 */
@SpringBootTest
public class MavenTests {

    @Test
    public void testMavenDependency(){
        MyStringUtil util = new MyStringUtil();
        System.out.println(util.hello("yjb"));
    }

    @Test
    public void testString(){
        String s = "123456";
        System.out.println(s.substring(0,4));
    }

    @Test
    public void test1(){
        String s1 = "";
        String s2 = "03";//父母
        String result = "result";
        if(StringUtils.isBlank(s1)){
            System.out.println("1");
        }else{
            System.out.println("2");
        }
    }
    @Test
    public void testList(){
        List<Stu> list1 = new ArrayList<>();
        Stu stu1 = new Stu("1","yjb");
        Stu stu2 = new Stu("2","gss");
        Stu stu3 = new Stu("3","hlh");
        Stu stu4 = new Stu("4","lj");
        list1.add(stu1);
        list1.add(stu2);
        list1.add(stu3);
        list1.add(stu4);
//        System.out.println(list1);

        //把List<对象>转换成List<String>
        List<String> list3 = list1.stream().map(Stu::getName).collect(Collectors.toList());
//        List<String> list2 = list.stream().map(Stu::getCode).distinct().sorted().limit(13).collect(Collectors.toList());
        System.out.println(list3);

        List<String> list2 = new ArrayList<>();
        list2.add("3");
        list2.add("4");
        list2.add("5");
        System.out.println(list2);

        //遍历list3，符合条件（不在list2中），收集起来
        List<String> list5 = list3.stream().filter(t -> !list2.contains(t)).collect(Collectors.toList());
        System.out.println(list5);

        if(CollectionUtils.isNotEmpty(list5)){
            list5.stream().sorted().forEach(System.out::println);
            list5.forEach(t-> System.out.println(t));
            for(String s:list5){
                System.out.println(s);
            }
        }
    }
}
