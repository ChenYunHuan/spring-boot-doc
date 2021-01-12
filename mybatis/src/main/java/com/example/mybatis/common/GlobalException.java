package com.example.mybatis.common;

public class GlobalException extends RuntimeException {

    private static final long serialVersionUID = -6603896283492750952L;

    private int code;
    private String msg;

    public GlobalException(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }


    public String getMsg() {
        return msg;
    }

}
