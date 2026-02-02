package com.tutorial.boot_demo;

public class Response <T> {
    private T data;
    private boolean success;
    private String errormsg;


    public static <k> Response<k> newSuccess(k data) {
        Response<k> response = new Response<>();
        response.setData(data);
        response.setSuccess(true);
        return response;
    }

    public static Response<Void> newSuccess(String errormsg) {
        Response<Void> response = new Response<>();
        response.setSuccess(false);
        response.setErrormsg(errormsg);
        return response;

    }
    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getErrormsg() {
        return errormsg;
    }

    public void setErrormsg(String errormsg) {
        this.errormsg = errormsg;
    }
}
