package com.lab.controller.exceptions;

public class WrongSexException extends RuntimeException{
    public WrongSexException(String msg) {
        super(msg);
    }
    public WrongSexException(){}
}
