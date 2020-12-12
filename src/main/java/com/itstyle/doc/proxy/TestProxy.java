package com.itstyle.doc.proxy;

import com.itstyle.doc.proxy.dynamicProxy.MyInvocationHandler;
import com.itstyle.doc.proxy.impl.HellowServiceImpl;
import com.itstyle.doc.proxy.proxyService.HellowProxy;
import org.junit.jupiter.api.Test;

import java.lang.reflect.InvocationTargetException;

public class TestProxy {

    public static void main(String[] args) throws Exception {
        HellowService hellowService = new HellowServiceImpl();
//
//        HellowProxy hellowProxy = new HellowProxy(hellowService);
//        hellowProxy.say();


        MyInvocationHandler myInvocationHandler = new MyInvocationHandler(hellowService);
//        HellowService hellowService1 = (HellowService) myInvocationHandler.getProxy();
//        hellowService1.say();

        myInvocationHandler.invoke(MyInvocationHandler.class, HellowService.class.getMethod("say"), null);
    }

    /**
     * 测试有参数得动态代理
     */
    @Test
    public void testParamProxy() throws Exception {
        HellowService hellowService = null;
        MyInvocationHandler myInvocationHandler = new MyInvocationHandler(new HellowServiceImpl());

        //方法一
//        hellowService = (HellowService) myInvocationHandler.getProxy();
//        hellowService.eat("apple");

        //方法二
        myInvocationHandler.invoke(MyInvocationHandler.class, HellowService.class.getMethod("eat", String.class), new Object[]{"apple"});
    }
}
