package com.gd.exception;

/**
 * Created by Administrator on 2018/7/30.
 */
public class AuthorityException extends BaseException {
    public AuthorityException(){
    }
    public AuthorityException(String message){
        super(message);
    }
    public AuthorityException(String code,String message){
        super(message);
        this.code=code;
    }


}
