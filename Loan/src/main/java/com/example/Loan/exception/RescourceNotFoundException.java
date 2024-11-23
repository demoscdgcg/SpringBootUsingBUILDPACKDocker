package com.example.Loan.exception;

public class RescourceNotFoundException extends RuntimeException{

    public RescourceNotFoundException(String message,String feildName,String feildValue){
        super(String.format("%s not found with the given data %s:%s",message,feildName,feildValue));
    }
}
