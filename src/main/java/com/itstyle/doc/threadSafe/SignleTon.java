package com.itstyle.doc.threadSafe;

import org.junit.jupiter.api.Test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 且听我慢慢道来：
 *
 * 当我们的虚拟机在执行 instance = new Singleton这句代码时，会被分解成以下三个动作来执行：
 *
 * memory = allocate();//1: 给对象分配内存空间。
 *
 * ctorInstance(memory);//2: 初始化对象
 *
 * instance = memory; //3: 把instance变量指向刚刚分配的内存地址。
 *
 * 但是，这三个动作的执行顺序并非是一成不变的，有可能经过JVM和CPU的优化编译之后，这三个动作的执行顺序发生了改变，变成了这样：
 *
 * memory = allocate();//1: 给对象分配内存空间。
 *
 * instance = memory; //3: 把instance变量指向刚刚分配的内存地址
 *
 * ctorInstance(memory);//2: 初始化对象
 *
 * 现在假设instance== null,且有p1, p2两个线程来调用这个方法。当p1执行完1，3但还没有执行2时，这时instance已经不再是null了。假如这个时候p2刚刚进入getInstance这个方法，然后执行if(instance == null)的判断语句，这个时候判断的结果会是false，于是p2直接把instance给返回的。
 *
 * 但由于p1还没有执行动作2，此时的对象还没有被初始化，但却已经被p2给返回了。此时，这个被返回的对象出现问题了。
 *
 * 于是，就出现了线程安全问题。
 */
public class SignleTon {

    private volatile SignleTon signleTon = null;

    public SignleTon() {
    }

    //单例模式
    public  SignleTon getSignleTon() {
        if (null == signleTon) {
            synchronized (SignleTon.class) {
                if (null == signleTon) {
                    signleTon = new SignleTon();
                }
            }
        }
        return signleTon;
    }


    @Test
    public void testThread() {
        ExecutorService executorService = Executors.newFixedThreadPool(1);
        for (int i = 0; i < 100; i++) {
            executorService.execute(new Runnable() {
                @Override
                public void run() {
                    try {
//                        System.out.println(getSignleTon());
                        Thread.sleep(100);
                    }
                    catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }
            });
        }
    }

}

