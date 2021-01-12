package com.itstyle.doc.stream;

import java.text.SimpleDateFormat;

public class TestBirthday {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        int i = Integer.parseInt("1001", 2);

        System.out.println(i);
    }



    public static  boolean checkBirthDay(String birthday) {
        SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");
        try {
            sd.setLenient(false);
            sd.parse(birthday);
        }
        catch (Exception e) {
            return false;
        }
        return true;
    }
}
