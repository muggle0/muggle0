package com.muggle.poseidon.base;

public class ErrorCode {
   public static final ErrorCode JSON_ERROR =new ErrorCode("json序列化异常",1001);
    private String message;
    private int code;

    ErrorCode(String message, int code) {
        this.message = message;
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
