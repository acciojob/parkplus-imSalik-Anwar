package com.driver.Exception;

public class InsufficientAmountException extends RuntimeException{
    public InsufficientAmountException(String message){
        super(message);
    }

    public InsufficientAmountException() {
    }
}
