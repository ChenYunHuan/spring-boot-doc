package com.itstyle.doc.factory;

import java.util.ArrayList;
import java.util.List;

public class TestModule {

    public static void main(String[] args) {
/*        CreateModule createModule = CreateModule.build().appendName().appendId().appendAge();

        List<String> testList = new ArrayList<>();

        testList.stream().filter(null).sorted();*/

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("");
            }
        });
        thread.start();
    }
}
