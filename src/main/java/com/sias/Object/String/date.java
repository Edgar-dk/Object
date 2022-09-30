package com.sias.Object.String;

import org.junit.jupiter.api.Test;

import javax.naming.Name;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

/**
 * @author Edgar
 * @create 2022-09-29 20:27
 * @faction:
 */
public class date {

    private static String name;

    /*1.第一代*/
    public static void main(String[] args) {
        Date date = new Date();
        /*1.格式化日期
        *   yyyy年，后面的按照时间往后推
        *   E是星期*/
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss E");
        String format = simpleDateFormat.format(date);
        System.out.println(format);
    }

    /*2.第二代*/
    @Test
    public void Calender(){
        Calendar instance = Calendar.getInstance();
    }
    @Test
    public void LocalDataTime(){
        /*2022-09-29T20:47:23.952*/
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        Instant now1 = Instant.now();
        System.out.println(now1);
        Date from = Date.from(now1);
        System.out.println(from);
    }
}
