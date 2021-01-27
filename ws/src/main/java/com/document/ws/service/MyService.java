package com.document.ws.service;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService(
        name = "MyService", // 暴露服务名称
        targetNamespace = "http://ws.document.com/"// 命名空间,一般是接口的包名倒序
)
public interface MyService {

    @WebMethod
    String sayHello(String name);

    @WebMethod
    String sayGoodBye(String name);
}
