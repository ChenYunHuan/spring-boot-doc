package com.itstyle.doc.threadSafe.callModel;


import java.util.Arrays;
import java.util.stream.Collectors;

public class SortThread extends Thread {

    private Integer[] arrays;

    public Integer[] getArrays() {
        return arrays;
    }

    public void setArrays(Integer[] arrays) {
        this.arrays = arrays;
    }

    public SortThread(Integer[] arrays) {
        this.arrays = arrays;
    }

    @Override
    public void run() {
        if (null != arrays) {
            arrays = Arrays.stream(arrays).sorted((o1, o2) -> o2 - o1).collect(Collectors.toList()).toArray(new Integer[arrays.length]);
            for (Integer array : arrays) {
                System.out.println("输出: " + array);
            }
        }
    }
}
