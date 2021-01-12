package com.itstyle.doc.threadSafe.threadDevelop;

import javax.xml.bind.DatatypeConverter;
import java.io.File;

public class TestInterface {

    private static final String dictory = "D:/upload/UMUploadDirectory/";

    public static void main(String[] args) {
        testTwo();
    }


    //方式一，空指针
    public static void testOne() {
        File file = new File(dictory);
        String[] list = file.list();
        for (String arg : list) {
            //计算结果
            ReturnDigest returnDigest = new ReturnDigest(dictory + arg);
            returnDigest.start();

            //显示结果
            StringBuilder result = new StringBuilder(arg);
            result.append(": ");
            byte[] digest = returnDigest.getDigest();
            result.append(DatatypeConverter.printHexBinary(digest));
            System.out.println(result);
        }
    }

    //方式二：
    public static void testTwo() {
        File file = new File(dictory);
        String[] list = file.list();

        ReturnDigest[] digests = new ReturnDigest[list.length];


        for (int i = 0; i < list.length; i++) {
            digests[i] = new ReturnDigest(dictory + list[i]);
            digests[i].start();
        }

        for (int i = 0; i < list.length; i++) {
            StringBuffer stringBuffer = new StringBuffer(list[i]);
            stringBuffer.append(": ");

            byte[] digest = digests[i].getDigest();
            stringBuffer.append(DatatypeConverter.printHexBinary(digest));
            System.out.println(stringBuffer);
        }


    }

}
