package com.zixuan.springboot;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

@SpringBootTest
@Slf4j
class DateToStringTests {

    @Test
    public void LocalDate_to_String() {
        String str = DateTimeFormatter.ofPattern("yyyy-MM-dd").format(LocalDate.now());
        log.info("str = " + str); //2021-11-06
    }

    @Test
    public void LocalDateTime_to_String() {
        String str = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        log.info("str = " + str);  // 2021-11-06 21:51:31
    }

    @Test
    public void java_util_Date_to_String() {
        String str = LocalDateTime.ofInstant(new java.util.Date().toInstant(), ZoneId.systemDefault())
                .format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        log.info("str = " + str);  //2021-11-06
    }

    @Test
    public void java_sql_Date_to_String() {
        String str = new java.sql.Date(System.currentTimeMillis()).toLocalDate()
                .format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        log.info("str = " + str);  //2021-11-06
    }

    @Test
    public void java_sql_Timestamp_to_String() {
        String str = new java.sql.Timestamp(System.currentTimeMillis()).toLocalDateTime()
                .format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        log.info("str = " + str);  //2021-11-06 21:56:03
    }

    @Test
    public void ZonedDateTime_to_String() {
        String str = ZonedDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        log.info("str = " + str);  //2021-11-06 22:13:54
    }
}
