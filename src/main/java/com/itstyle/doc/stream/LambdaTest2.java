package com.itstyle.doc.stream;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaTest2 {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("a", "f", "g", "b", "c");
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
        System.out.println(list);

        List<String> collect = Arrays.asList("a", "f", "g", "b", "c").stream().sorted((e1, e2) -> e1.compareTo(e2)).collect(Collectors.toList());
        System.out.println(collect);


    }
}
