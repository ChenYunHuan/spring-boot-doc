package com.itstyle.doc.threadSafe.threadDevelop;

import java.io.FileInputStream;
import java.security.DigestInputStream;
import java.security.MessageDigest;

public class ReturnDigest extends Thread {

    private String fileName;
    private byte[] digest;

    public ReturnDigest(String fileName) {
        this.fileName = fileName;
    }

    public byte[] getDigest() {
        return digest;
    }

    @Override
    public void run() {
        try {
            FileInputStream fileInputStream = new FileInputStream(fileName);
            MessageDigest instance = MessageDigest.getInstance("SHA-256");
            DigestInputStream digestInputStream = new DigestInputStream(fileInputStream, instance);
            while (digestInputStream.read() != -1);
            digestInputStream.close();
            digest = instance.digest();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
