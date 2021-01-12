package com.itstyle.doc.threadSafe.debugThread;

public class ThreadTest {


    public static void main(String[] args) {
        MyThread myThread = new MyThread();

        Thread thread = new Thread(myThread, "tom");
        Thread thread1 = new Thread(myThread, "jerry");
        Thread thread2 = new Thread(myThread, "look");


        thread.start();

        thread1.start();

        thread2.start();


    }
}
