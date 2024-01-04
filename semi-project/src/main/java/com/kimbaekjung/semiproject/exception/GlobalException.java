package com.kimbaekjung.semiproject.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalException {

    @ExceptionHandler(Exception.class)
    public String allExceptionHandler(Exception e){
        System.out.println("exception 발생");
        return "error/default";
    }
}
