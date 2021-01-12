package com.itstyle.doc.threadSafe.threadDevelop;

import javax.xml.bind.DatatypeConverter;
import java.io.File;

public class CallBackUserDigestInterface {

    private static final String dictory = "D:/upload/UMUploadDirectory/";

    public static void receiveDigest(byte[] digest, String name) {
        StringBuilder result = new StringBuilder(name);
        result.append(": ");
        result.append(DatatypeConverter.printHexBinary(digest));
        System.out.println(result);
    }

    public static void main(String[] args) {
        File file = new File(dictory);
        String[] list = file.list();

        for (String arg : list) {
            CallBackDigest callBackDigest = new CallBackDigest(dictory + arg);
            Thread thread = new Thread(callBackDigest);
            thread.start();
        }
    }
}
