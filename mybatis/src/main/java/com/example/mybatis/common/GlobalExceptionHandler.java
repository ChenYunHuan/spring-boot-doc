package com.example.mybatis.common;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;

@RestControllerAdvice  //该注解定义全局异常处理类
//@ControllerAdvice(basePackages ="com.example.demo.controller") 可指定包
@ResponseBody
public class GlobalExceptionHandler {
    @ExceptionHandler(value = Exception.class) //该注解声明异常处理方法
    public Result<String> exceptionHandler(HttpServletRequest request, Exception e) {
        //对于自定义异常的处理
        if (e instanceof GlobalException) {
            GlobalException ex = (GlobalException) e;
            return Result.error(ex.getCode(), ex.getMsg());
            //对于绑定异常的处理，使用jsr303中的自定义注解抛出的异常属于绑定异常
        }
        else {
            e.printStackTrace();
            return Result.error(ResultEnum.SYSTEM_ERROR.getResultCode(), ResultEnum.SYSTEM_ERROR.getResultMsg());
        }
    }
}
