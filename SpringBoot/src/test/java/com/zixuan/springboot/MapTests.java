package com.zixuan.springboot;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashMap;

@SpringBootTest
public class MapTests {

    @Test
    public void MapTest(){
        HashMap hashMap = new HashMap();
        hashMap.put("YJD","一季度");
        hashMap.put("EJD","二季度");
        hashMap.put("SJD","三季度");
        hashMap.put("SJD","四季度");

        System.out.println(hashMap.get("EJD"));
    }
}
