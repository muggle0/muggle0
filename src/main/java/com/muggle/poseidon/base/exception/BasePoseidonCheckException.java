package com.muggle.poseidon.base.exception;


/**
 * @program: poseidon-cloud-starter
 * @description:
 * @author: muggle
 * @create: 2019-11-06
 **/

public abstract class BasePoseidonCheckException extends Exception {

    public BasePoseidonCheckException(String message) {
        super(message);
    }

    public abstract Integer getCode();

    public BasePoseidonCheckException(Throwable e){
        super(e);
    }

    public BasePoseidonCheckException(String message,Throwable e){
        super(message,e);
    }

}
