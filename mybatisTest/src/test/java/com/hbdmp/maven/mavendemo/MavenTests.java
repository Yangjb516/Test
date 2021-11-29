package com.hbdmp.maven.mavendemo;

import com.hbdmp.util.MyStringUtil;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

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

}
