package com.example.mybatis.mapper;

import com.example.mybatis.model.Books;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;


@Repository
public interface AccountMapper {
    Books selectAccount(@Param("id") String id);
}
