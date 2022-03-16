package com.zixuan.springboot;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.sql.Timestamp;
import java.time.*;
import java.time.format.DateTimeFormatter;

@SpringBootTest
@Slf4j
class StringToDateTests {

    @Test
    public void String_to_ZonedDateTime() {
        ZonedDateTime dateTime = ZonedDateTime.from(DateTimeFormatter.ISO_OFFSET_DATE_TIME.withZone(ZoneId.systemDefault())
                .parse("2011-05-24T14:15:30+08:00"));
        log.info("time = " + dateTime); //2011-05-24T14:15:30+08:00[Asia/Shanghai]
    }

    @Test
    public void String_to_LocalDate() {
        LocalDate date = LocalDate.parse("2020-04-13", DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        log.info("date = " + date);  //2020-04-13
    }

    @Test
    public void String_to_LocalDateTime() {
        LocalDateTime time = LocalDateTime.parse("2020-04-13 18:49:30", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        log.info("time = " + time);  //2020-04-13T18:49:30
    }

    @Test
    public void String_to_java_util_Date() {
        Instant instant = LocalDate.parse("2020-04-13", DateTimeFormatter.ofPattern("yyyy-MM-dd"))
                .atStartOfDay()
                .atZone(ZoneId.systemDefault())
                .toInstant();
        java.util.Date date = java.util.Date.from(instant);
        log.info("date = " + date);  // Mon Apr 13 00:00:00 CST 2020
    }

    @Test
    public void String_to_java_sql_Date() {
        LocalDate localDate = LocalDate.parse("2020-04-20", DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        java.sql.Date date = java.sql.Date.valueOf(localDate);
        log.info("date = " + date);  //2020-04-20
    }

    @Test
    public void String_to_java_sql_Timestamp() {  // String 转 java.sql.Date
        LocalDateTime localDateTime = LocalDateTime.parse("2020-04-20 19:20:00", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        java.sql.Timestamp timestamp = Timestamp.valueOf(localDateTime);
        log.info("timestamp = " + timestamp);  //2020-04-20 19:20:00.0
    }

}
