package com.example.mybatis.controller;

import com.example.mybatis.common.GlobalException;
import com.example.mybatis.common.Result;
import com.example.mybatis.model.Account;
import com.example.mybatis.service.AccountService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping(value = "acct/")
public class AccountController {
    private static final Logger logger = LoggerFactory.getLogger(AccountController.class);

    @Autowired
    AccountService accountService;

    /**
     * 根据账户查询账户信息
     * @param id
     * @return
     */
    @RequestMapping(value = "qryAccount", method = RequestMethod.GET)
    public Result qryAccount(@RequestParam String id) {
        logger.info("qryAccount is begin , request param is {}", id);
        Account account = accountService.qryAccount(id);
        logger.info("qryAccount is begin , response param is {}", account);
        return Result.success(account);
    }

    /**
     * 根据账户查询账户信息
     * @param account
     * @return
     */
    @RequestMapping(value = "addAccount", method = RequestMethod.POST)
    public Result addAccount(@RequestBody Account account) throws GlobalException {
        logger.info("qryAccount is begin , request param is {}", account);
        int accountId = accountService.addAccount(account);
        Map<String, Integer> resultMap = new HashMap<String, Integer>();
        resultMap.put("accountId", accountId);
        logger.info("qryAccount is begin , response param id is {}", resultMap);
        return Result.success(resultMap);
    }

    /**
     * 根据账户id 编辑账户信息
     * @param account
     * @return
     */
    @RequestMapping(value = "editAccount", method = RequestMethod.POST)
    public Result editAccount(@RequestBody Account account) throws GlobalException {
        logger.info("editAccount is begin , request param is {}", account);
        Boolean resultFlag = accountService.editAccount(account);
        Map<String, Boolean> resultMap = new HashMap<String, Boolean>();
        resultMap.put("resultFlag", resultFlag);
        logger.info("editAccount is begin , response param id is {}", resultMap);
        return Result.success(resultMap);
    }
}
