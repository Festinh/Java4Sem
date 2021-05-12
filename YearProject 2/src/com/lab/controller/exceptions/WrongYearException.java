package com.lab.controller.exceptions;

public class WrongYearException extends RuntimeException{
    public WrongYearException(String msg) {
        super(msg);
    }
    public WrongYearException(){}
}
