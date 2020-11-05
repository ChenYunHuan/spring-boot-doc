package com.itstyle.doc.stream;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalTimeTest {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);

        LocalDate localDate = now.toLocalDate();
        System.out.println(localDate);

        LocalTime localTime = now.toLocalTime();
        System.out.println(localTime);

        int year = now.getYear();
        System.out.println(year + "年");
        int month = now.getMonthValue();
        System.out.println(month + "月");
        int dayOfMonth = now.getDayOfMonth();
        System.out.println(dayOfMonth + "日");
        int hour = now.getHour();
        System.out.println(hour + "时");
        int minute = now.getMinute();
        System.out.println(minute + "分");
        int second = now.getSecond();
        System.out.println(second + "秒");

        int nano = now.getNano();
        System.out.println(nano);
    }
}
