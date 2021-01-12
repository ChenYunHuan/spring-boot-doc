package com.itstyle.doc.bingdu;

import java.io.IOException;

public class ApacheCommonTest {

    public static void main(String[] args) throws IOException {
        Process cmd = Runtime.getRuntime().exec("open /Applications/Calculator.app");
        System.err.println("p====" + cmd.isAlive());
    }
}
