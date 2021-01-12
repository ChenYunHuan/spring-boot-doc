package com.itstyle.doc.tryCatch;

public class TestA {

    // 测试 修改值类型
    static int f() {
        int ret = 0;
        try {
            return ret;  // 返回 0，finally内的修改效果不起作用
        }
        finally {
            ++ret;
            System.out.println("finally执行");
        }
    }

    // 测试 修改引用类型
    static int[] f2() {
        int[] ret = new int[]{0};
        try {
            return ret;  // 返回 [1]，finally内的修改效果起了作用
        }
        finally {
            ret[0]++;
            System.out.println("finally执行");
        }
    }


    public static void main(String[] args) {
        int f = f();
        System.out.println(f);

        int[] ints = f2();
        System.out.println(ints);
    }

}
