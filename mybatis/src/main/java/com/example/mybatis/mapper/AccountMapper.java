package com.example.mybatis.mapper;

import com.example.mybatis.model.Account;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;


@Repository
public interface AccountMapper extends Mapper {
    Account selectAccount(@Param("id") String id);

    int insertAccount(@Param("account") Account account);

    int updateAccount(@Param("account") Account account);

    int checkCertId(@Param("certId") String certId);
}
