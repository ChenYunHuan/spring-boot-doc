package com.itstyle.doc.threadSafe.threadPratices;


import com.itstyle.doc.threadSafe.callModel.SortThread;

import java.util.Arrays;

public class JoinPractice {

    public static void main(String[] args) {
        Integer[] arrays = new Integer[100];

        for (int i = 0; i < arrays.length; i++) {
            arrays[i] = (int) (Math.random() * 100);
        }

        System.out.println();

        SortThread sortThread = new SortThread(arrays);
        sortThread.start();

        try {
            sortThread.join();
            System.out.println("--------------------------分割线------------------------------");
            arrays = sortThread.getArrays();
            Arrays.stream(arrays).forEach(System.out::println);
        }
        catch (Exception e) {
            System.out.println("error");
        }
    }
}
