package com.driver.Exception;

public class PaymentModeNotDetectedException extends  RuntimeException{
    public PaymentModeNotDetectedException(String message){
        super(message);
    }
    public PaymentModeNotDetectedException(){

    }
}
