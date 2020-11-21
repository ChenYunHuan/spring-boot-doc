package com.example.mybatis.service.impl;

import com.example.mybatis.common.GlobalException;
import com.example.mybatis.common.ResultEnum;
import com.example.mybatis.mapper.AccountMapper;
import com.example.mybatis.model.Account;
import com.example.mybatis.service.AccountService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
public class AccountServiceImpl implements AccountService {

    @Resource
    private AccountMapper accountMapper;

    /**
     * 根据id 查询账户
     * @param id
     * @return
     */
    @Override
    public Account qryAccount(String id) {
        Account account = accountMapper.selectAccount(id);
        if (null == account) {
            throw new GlobalException(ResultEnum.ACCOUNT_ID_IS_NOT_VALID.getResultCode(), ResultEnum.ACCOUNT_ID_IS_NOT_VALID.getResultMsg());
        }
        return account;
    }

    /**
     * 插入账户
     * @param account
     * @return
     */
    @Override
    @Transactional
    public int addAccount(Account account) throws GlobalException {
        if (null != account) {
            if (null == account.getCertId()) {
                throw new GlobalException(ResultEnum.CERT_ID_IS_NULL.getResultCode(), ResultEnum.CERT_ID_IS_NULL.getResultMsg());
            }
            int i = accountMapper.checkCertId(account.getCertId());
            if (i > 0) {
                throw new GlobalException(ResultEnum.CERT_ID_IS_EXIST.getResultCode(), ResultEnum.CERT_ID_IS_EXIST.getResultMsg());
            }
            accountMapper.insertAccount(account);

            return account.getAccountId();
        }
        return 0;
    }

    /**
     * @desc 编辑账户
     * @author chen.yunhuan
     * @param account
     * @return
     */
    @Override
    public Boolean editAccount(Account account) {
        //编辑时 account_id 不能为空
        if (null == account || null == account.getAccountId()) {
            throw new GlobalException(ResultEnum.ACCOUNT_ID_IS_NULL.getResultCode(), ResultEnum.ACCOUNT_ID_IS_NULL.getResultMsg());
        }
        accountMapper.updateAccount(account);
        return true;
    }
}
