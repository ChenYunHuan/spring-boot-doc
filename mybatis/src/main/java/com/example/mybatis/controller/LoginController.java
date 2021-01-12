package com.example.mybatis.controller;

import com.example.mybatis.common.GlobalException;
import com.example.mybatis.common.Result;
import com.example.mybatis.common.ResultEnum;
import com.example.mybatis.model.UserBean;
import com.example.mybatis.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
public class LoginController {

    @Resource
    LoginService loginService;

    @PostMapping("/v1/login")
    public Object login(@RequestBody UserBean userBean, HttpServletRequest request, HttpServletResponse response) {
        if (loginService.checkLogin(userBean)) {
            response.setStatus(ResultEnum.SUCCESS.getResultCode());
            request.getSession().setAttribute("CURRENT_USER", userBean);
            return userBean;
        }
        throw new GlobalException(ResultEnum.SYSTEM_ERROR.getResultCode(), ResultEnum.SYSTEM_ERROR.getResultMsg());
    }

    @PostMapping(value = "/v1/logout")
    public void logout(HttpServletRequest request, HttpServletResponse response) {
//        if (loginService.getCurrentUser(request.getSession()) != null) {
//            request.getSession().invalidate();
//            response.setStatus(RestResponseEnum.SUCCESS.getCode());
//        }
    }
}
