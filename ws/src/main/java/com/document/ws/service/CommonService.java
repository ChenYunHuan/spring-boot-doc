package com.document.ws.service;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService(
        name = "CommonService", // 暴露服务名称
        targetNamespace = "http://ws.document.com/"// 命名空间,一般是接口的包名倒序
)
public interface CommonService {

    @WebMethod
    String sayHello(String name);
}
