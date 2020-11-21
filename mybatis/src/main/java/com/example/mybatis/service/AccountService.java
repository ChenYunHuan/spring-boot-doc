package com.example.mybatis.service;

import com.example.mybatis.common.GlobalException;
import com.example.mybatis.model.Account;

public interface AccountService {
    Account qryAccount(String id);

    int addAccount(Account account) throws GlobalException;

    Boolean editAccount(Account account);
}
