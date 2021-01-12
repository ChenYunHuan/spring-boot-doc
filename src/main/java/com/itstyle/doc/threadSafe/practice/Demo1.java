package com.itstyle.doc.threadSafe.practice;

import org.junit.jupiter.api.Test;

import java.util.concurrent.TimeUnit;

public class Demo1 {

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("start");
                boolean flag = false;
                while (!flag) {
                    ;
                }
                System.out.println("end");
            }
        });

        thread.setName("thread1");
        thread.start();

        //当前线程休息一秒
        TimeUnit.SECONDS.sleep(1);
        //关闭thread
        thread.stop();
        //输出thread 状态
        System.out.println(thread.getState());
        TimeUnit.SECONDS.sleep(1);
        System.out.println(thread.getState());
    }


    /**
     * 线程中断 - 通过变量控制
     */
    static volatile boolean isStop = false;

    @Test
    public void testThread() throws InterruptedException {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    if (isStop) {
                        System.out.println("我要退出了");
                        break;
                    }
                }
            }
        });

        thread.setName("thread");
        thread.start();
        TimeUnit.SECONDS.sleep(1);
        isStop = true;
    }


    /**
     * 线程中断， 通过interrupt
     * 中断方法会抛弃常
     */
    @Test
    public void testThread1() throws InterruptedException {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    try {
                        TimeUnit.SECONDS.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("我要退出了");
                    break;
                }
            }
        });

        thread.setName("thread");
        thread.start();

        TimeUnit.SECONDS.sleep(1);
        thread.interrupt();
    }

    /**
     * 测试中断方法抛异常
     */
    @Test
    public void testThread2() {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    try {
                        TimeUnit.SECONDS.sleep(1000);
                    }
                    catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    break;
                }

            }
        });
        thread.start();
    }
}
