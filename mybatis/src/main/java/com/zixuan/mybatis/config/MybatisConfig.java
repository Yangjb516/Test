package com.zixuan.mybatis.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * author yjb
 * create 2021/11/26 - 9:21
 */
@Configuration
public class MybatisConfig {
    @Bean
    public MyConfig initMyConfig(){
        return new MyConfig();
    }
}
