package com.itstyle.doc.proxy.proxyService;

import com.itstyle.doc.proxy.HellowService;

public class HellowProxy {

    private HellowService target;

    public HellowProxy(HellowService target) {
        this.target = target;
    }

    public void say() {
        System.out.println("begin services");
        target.say();
        System.out.println("end services");
    }

}
