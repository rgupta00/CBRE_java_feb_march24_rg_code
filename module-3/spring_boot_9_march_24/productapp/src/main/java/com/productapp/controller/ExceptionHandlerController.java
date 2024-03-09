package com.productapp.controller;

import com.productapp.dto.ErrorInfo;
import com.productapp.exceptions.ProductNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

import java.time.LocalDateTime;

@RestControllerAdvice //using AOP under the hood throws advice
public class ExceptionHandlerController {

    //handler to handler which ex : productNotFOundEx
    @ExceptionHandler(Exception.class)
    public ResponseEntity<ErrorInfo> handle500(Exception ex, WebRequest webRequest){

        ErrorInfo errorInfo=new ErrorInfo();
        errorInfo.setErrorMessage("pls try after some time");
        errorInfo.setToContact("rgupta.metch@gmail.com");
        errorInfo.setLocalDateTime(LocalDateTime.now());
        errorInfo.setHttpStatusCode(HttpStatus.INTERNAL_SERVER_ERROR.toString());
        String url=webRequest.getDescription(false);
        errorInfo.setUrl(url);
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(errorInfo);
    }



    //handler to handler which ex : productNotFOundEx
    @ExceptionHandler(ProductNotFoundException.class)
    public ResponseEntity<ErrorInfo> handle404(ProductNotFoundException ex, WebRequest webRequest){

        ErrorInfo errorInfo=new ErrorInfo();
        errorInfo.setErrorMessage(ex.getMessage());
        errorInfo.setToContact("rgupta.metch@gmail.com");
        errorInfo.setLocalDateTime(LocalDateTime.now());
        errorInfo.setHttpStatusCode(HttpStatus.NOT_FOUND.toString());
        String url=webRequest.getDescription(false);
        errorInfo.setUrl(url);
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(errorInfo);
    }
}
