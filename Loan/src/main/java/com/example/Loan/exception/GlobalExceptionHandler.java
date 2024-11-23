package com.example.Loan.exception;

import com.example.Loan.dto.ErrorResponseDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import java.time.LocalDateTime;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(LoanAllreadyExistWithTheGivenMobileNo.class)
    public ResponseEntity<ErrorResponseDto> loanAllReadyExistWithMobileNo(LoanAllreadyExistWithTheGivenMobileNo exception, WebRequest request) {
        ErrorResponseDto errorResponseDto = new ErrorResponseDto(
                request.getDescription(false),
                HttpStatus.BAD_REQUEST,
                exception.getMessage(),
                LocalDateTime.now()
        );
        return new ResponseEntity<>(errorResponseDto,HttpStatus.BAD_REQUEST );
    }

    @ExceptionHandler(RescourceNotFoundException.class)
    public ResponseEntity<ErrorResponseDto> handleRescourceNotFoundException(RescourceNotFoundException rescourceNotFoundException,WebRequest request){
        ErrorResponseDto errorResponseDto=new ErrorResponseDto(
                request.getDescription(false),
                HttpStatus.BAD_REQUEST,
                rescourceNotFoundException.getMessage(),
                LocalDateTime.now()
        );
        return new ResponseEntity<>(errorResponseDto,HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ErrorResponseDto> handleException(Exception exception,WebRequest request){
        ErrorResponseDto errorResponseDto=new ErrorResponseDto(
                request.getDescription(false),
                HttpStatus.INTERNAL_SERVER_ERROR,
                exception.getMessage(),
                LocalDateTime.now()
        );
        return new ResponseEntity<>(errorResponseDto,HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
