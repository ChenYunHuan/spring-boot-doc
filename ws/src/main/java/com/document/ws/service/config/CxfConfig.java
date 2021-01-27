package com.document.ws.service.config;

import com.document.ws.service.CommonService;
import com.document.ws.service.MyService;
import org.apache.cxf.Bus;
import org.apache.cxf.jaxws.EndpointImpl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.xml.ws.Endpoint;

@Configuration
public class CxfConfig {

    @Autowired
    private Bus bus;

    @Autowired
    CommonService commonService;

    @Autowired
    MyService myService;

    /** JAX-WS **/
    @Bean
    public Endpoint endpoint() {
        EndpointImpl endpoint = new EndpointImpl(bus, commonService);
        endpoint.publish("/CommonService");
        return endpoint;
    }

    @Bean
    public Endpoint endpoint1() {
        EndpointImpl endpoint = new EndpointImpl(bus, myService);
        endpoint.publish("/myService");
        return endpoint;
    }
}