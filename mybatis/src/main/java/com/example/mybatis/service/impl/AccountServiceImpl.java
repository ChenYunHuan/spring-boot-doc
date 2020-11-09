package com.example.mybatis.service.impl;

import com.example.mybatis.mapper.AccountMapper;
import com.example.mybatis.model.Books;
import com.example.mybatis.service.AccountService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class AccountServiceImpl implements AccountService {

    @Resource
    private AccountMapper accountMapper;

    @Override
    public void qryAccount(String id) {
        Books books = accountMapper.selectAccount(id);
        System.out.println(books);
    }
}
