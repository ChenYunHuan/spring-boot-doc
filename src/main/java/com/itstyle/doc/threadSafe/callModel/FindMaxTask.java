package com.itstyle.doc.threadSafe.callModel;

import java.util.concurrent.Callable;

public class FindMaxTask implements Callable<Integer> {

    private Integer[] data;
    private int start;
    private int end;

    public FindMaxTask(Integer[] data, int start, int end) {
        this.data = data;
        this.start = start;
        this.end = end;
    }


    @Override
    public Integer call() throws Exception {
        int max = Integer.MIN_VALUE;
        for (int i = start; i < end; i++) {
            if (data[i] > max) {
                max = data[i];
            }
        }
        return max;
    }
}
