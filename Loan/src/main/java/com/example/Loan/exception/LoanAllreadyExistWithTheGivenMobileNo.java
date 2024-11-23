package com.example.Loan.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST)
public class LoanAllreadyExistWithTheGivenMobileNo extends RuntimeException{

    public LoanAllreadyExistWithTheGivenMobileNo(String message,String value){
        super(String.format("%s not found with the given data %s",message,value));
    }
}
