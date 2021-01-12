package com.example.mybatis.service.impl;

import com.example.mybatis.model.UserBean;
import com.example.mybatis.service.LoginService;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {
    @Override
    public boolean checkLogin(UserBean userBean) {
        return true;
    }
}
