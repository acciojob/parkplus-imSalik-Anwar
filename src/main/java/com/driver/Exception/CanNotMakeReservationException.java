package com.driver.Exception;

public class CanNotMakeReservationException extends  RuntimeException{
    public CanNotMakeReservationException(String message){
        super(message);
    }
    public CanNotMakeReservationException(){

    }
}
