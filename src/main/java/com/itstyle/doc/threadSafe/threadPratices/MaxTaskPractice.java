package com.itstyle.doc.threadSafe.threadPratices;

import com.itstyle.doc.threadSafe.callModel.FindMaxTask;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MaxTaskPractice {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        List<Integer> dataList = new ArrayList<>();
        for (int i = 0; i < 100000000; i++) {
            dataList.add(i);
        }

        Integer[] data = dataList.toArray(new Integer[dataList.size()]);
        //多线程
        long start = System.currentTimeMillis();
        System.out.println(maxOne(data));
        System.out.println(System.currentTimeMillis() - start);

        //非多线程
//        start = System.currentTimeMillis();
//        System.out.println(maxTwo(data));
//        System.out.println(System.currentTimeMillis() - start);

    }


    public static int maxOne(Integer[] data) throws ExecutionException, InterruptedException {
        if (data.length == 1) {
            return data[0];
        }
        else if (data.length == 0) {
            throw new IllegalArgumentException();
        }

        //将任务分解成两个部分
        FindMaxTask findMaxTask1 = new FindMaxTask(data, 0, data.length / 2);
        FindMaxTask findMaxTask2 = new FindMaxTask(data, data.length / 2, data.length);

        ExecutorService executorService = Executors.newFixedThreadPool(2);

        Future<Integer> future1 = executorService.submit(findMaxTask1);
        Future<Integer> future2 = executorService.submit(findMaxTask2);

        return Math.max(future1.get(), future2.get());
    }


    public static int maxTwo(Integer[] data) {
        int max = Integer.MIN_VALUE;
        if (null != data) {
            for (Integer datum : data) {
                if (datum > max) {
                    max = datum;
                }
            }
        }
        return max;
    }
}
