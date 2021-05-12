package com.lab.controller.exceptions;

public class WrongMarksException extends RuntimeException{
    public WrongMarksException(String msg) {
        super(msg);
    }
    public WrongMarksException(){}
}
