package com.example.mybatis.common;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

public class WebConfig implements WebMvcConfigurer {
    @Autowired
    private LoginInterceptor loginInterceptor;


    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        // 只有登录接口才会被拦截到
        registry.addInterceptor(loginInterceptor).addPathPatterns("/**").excludePathPatterns("/v1/login", "/v1/admin/login");
    }
}
