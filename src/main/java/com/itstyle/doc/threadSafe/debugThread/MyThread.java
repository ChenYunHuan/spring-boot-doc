package com.itstyle.doc.threadSafe.debugThread;

public class MyThread implements Runnable {


    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "running");
    }
}
