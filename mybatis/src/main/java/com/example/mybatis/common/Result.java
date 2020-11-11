package com.example.mybatis.common;

/**
 * 返回结果封装
 * @param <T>
 */
public final class Result<T> {
    private int code;
    private String msg;
    private T data;

    /**
     * 成功时候的调用
     * */
    public static <T> Result<T> success(T data) {
        return new Result<T>(data);
    }

    /**
     * 失败时候的调用
     */
    public static <T> Result<T> error(int code, String msg) {
        return new Result<T>(null, code, msg);
    }

    /**
     * 成功时只设置消息
     */
    private Result(T data, int code, String msg) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public Result(T data) {
        this.code = 0;
        this.msg = "success";
        this.data = data;
    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    public T getData() {
        return data;
    }
}
