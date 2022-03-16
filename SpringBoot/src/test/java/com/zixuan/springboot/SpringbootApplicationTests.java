package com.zixuan.springboot;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

@SpringBootTest
class SpringbootApplicationTests {

    @Test
    void listKeyMap() {
        List<String> list = new ArrayList<>();
        list.add("yjb");
        list.add("yqn");
        list.add("yzx");
        //1.list.for
        for (String s : list) {
            System.out.println(s);
        }
        //2.list.forEach
        list.forEach(s -> System.out.println(s));
        //3.list.fori
        for (int i = 0; i < list.size(); i++) {

        }
        //4.list.forr
        for (int i = list.size() - 1; i >= 0; i--) {

        }
    }

    @Test
    void testDate() {
        String strDate = "2022-03-16";
        String pattern = "";
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern(pattern);
        LocalDate localDate = LocalDate.parse(strDate, dateTimeFormatter);
        System.out.println(localDate);
    }
}
