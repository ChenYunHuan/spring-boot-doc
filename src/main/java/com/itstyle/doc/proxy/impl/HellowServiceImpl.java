package com.itstyle.doc.proxy.impl;

import com.itstyle.doc.proxy.HellowService;

public class HellowServiceImpl implements HellowService {

    @Override
    public void say() {
        System.out.println("i am impl");
    }

    @Override
    public void eat(String food) {
        System.out.println(food + " is good");
    }
}
