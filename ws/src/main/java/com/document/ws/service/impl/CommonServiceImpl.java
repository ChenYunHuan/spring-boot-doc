package com.document.ws.service.impl;

import com.document.ws.service.CommonService;
import org.springframework.stereotype.Service;

import javax.jws.WebService;

@WebService(
        serviceName = "CommonService", // 与接口中指定的name一致
        targetNamespace = "http://ws.document.com/", // 与接口中的命名空间一致,一般是接口的包名倒
        endpointInterface = "com.document.ws.service.CommonService"// 接口地址
)
@Service
public class CommonServiceImpl implements CommonService {

    @Override
    public String sayHello(String name) {
        // TODO Auto-generated method stub
        return "Welcome to China, " + name;
    }
}
