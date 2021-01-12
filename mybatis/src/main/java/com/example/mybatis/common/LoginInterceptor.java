package com.example.mybatis.common;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
public class LoginInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) {
        if (request.getSession().getAttribute("CURRENT_USER") == null) {
            response.setStatus(ResultEnum.CERT_ID_IS_NULL.getResultCode());
            return false;
        }
        else {
            return true;
        }
    }

}
