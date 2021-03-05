package com.epam.izh.rd.online.exception;

public class UserAlreadyRegisteredException extends Throwable {
    UserAlreadyRegisteredException(){}
    public UserAlreadyRegisteredException(String msg){super(msg);}
}
