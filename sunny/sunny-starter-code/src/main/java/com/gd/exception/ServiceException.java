package com.gd.exception;

/**
 * Service层异常
 * Created by Administrator on 2018/7/5.
 */
public class ServiceException extends BaseException {
    private static final long serialVersionUID = 6058294324031642376L;

    public ServiceException(){

    }
    public ServiceException(String message){
        super(message);
    }
    public ServiceException(String code,String message){
        super(code,message);
    }

}
