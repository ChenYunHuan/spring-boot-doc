package com.itstyle.doc.proxy.dynamicProxy;

import org.springframework.cglib.proxy.Proxy;

import org.springframework.cglib.proxy.InvocationHandler;
import java.lang.reflect.Method;

public class MyInvocationHandler implements InvocationHandler {

    private Object target;

    public MyInvocationHandler(Object target) {
        super();
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Exception {
        System.out.println("代理开始................................................");
        Object result = method.invoke(target, args);
        System.out.println("代理结束.................................................");
        return result;
    }


    public Object getProxy() {
        return Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(), target.getClass().getInterfaces(), this);
    }
}
