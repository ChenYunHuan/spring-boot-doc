package com.itstyle.doc.stream;

import java.text.SimpleDateFormat;

public class TestBirthday {
    public static void main(String[] args) {

        System.out.println(checkBirthDay("2020-17-10"));

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
