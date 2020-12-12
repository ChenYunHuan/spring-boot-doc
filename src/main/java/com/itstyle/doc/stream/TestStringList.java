package com.itstyle.doc.stream;

import com.github.pagehelper.util.StringUtil;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TestStringList {

    public static void main(String[] args) {

        List<String> stringList = new ArrayList<>();
        stringList.add("");
        stringList.add("11");
        stringList.add("22");
        stringList.add("");

        List<String> collect = stringList.stream().filter(StringUtil::isNotEmpty).collect(Collectors.toList());
        System.out.println(collect);
    }
}
