package com.example.mybatis.service;

import com.example.mybatis.model.UserBean;

public interface LoginService {
    boolean checkLogin(UserBean userBean);
}
