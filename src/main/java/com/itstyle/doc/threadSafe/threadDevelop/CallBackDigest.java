package com.itstyle.doc.threadSafe.threadDevelop;

import java.io.FileInputStream;
import java.security.DigestInputStream;
import java.security.MessageDigest;

public class CallBackDigest implements Runnable {

    private String fileName;

    public CallBackDigest(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void run() {
        try {
            FileInputStream fileInputStream = new FileInputStream(fileName);
            MessageDigest instance = MessageDigest.getInstance("SHA-256");
            DigestInputStream digestInputStream = new DigestInputStream(fileInputStream, instance);
            while (digestInputStream.read() != -1);
            digestInputStream.close();

            byte[] digest = instance.digest();
            CallBackUserDigestInterface.receiveDigest(digest, fileName);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
