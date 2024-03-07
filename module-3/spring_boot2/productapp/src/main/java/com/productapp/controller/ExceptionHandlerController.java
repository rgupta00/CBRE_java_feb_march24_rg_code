package com.productapp.controller;

import com.productapp.dto.ErrorInfo;
import com.productapp.exceptions.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

import java.time.LocalDateTime;
import java.util.stream.Collectors;

@RestControllerAdvice //using AOP under the hood throws advice
public class ExceptionHandlerController {

    @Autowired
    private Environment environment;

    //MethodArgumentNotValidException ==>
        @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<ErrorInfo> handle400(MethodArgumentNotValidException ex, WebRequest webRequest){

        ErrorInfo errorInfo=new ErrorInfo();
        //I want actual message to send to the client
            String errorMessage= ex.getBindingResult()
                            .getAllErrors()
                                    .stream()
                                            .map(x->x.getDefaultMessage())
                                                    .collect(Collectors.joining(", "));

        errorInfo.setErrorMessage(errorMessage);
        errorInfo.setToContact("rgupta.metch@gmail.com");
        errorInfo.setLocalDateTime(LocalDateTime.now());
        errorInfo.setHttpStatusCode(HttpStatus.BAD_REQUEST.toString());
        String url=webRequest.getDescription(false);
        errorInfo.setUrl(url);
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorInfo);
    }


//    //handler to handler which ex : productNotFOundEx
//    @ExceptionHandler(Exception.class)
//    public ResponseEntity<ErrorInfo> handle500(Exception ex, WebRequest webRequest){
//
//        ErrorInfo errorInfo=new ErrorInfo();
//        errorInfo.setErrorMessage(environment.getProperty("UserInterface.INTERNAL_SERVER_ERROR"));
//        errorInfo.setToContact("rgupta.metch@gmail.com");
//        errorInfo.setLocalDateTime(LocalDateTime.now());
//        errorInfo.setHttpStatusCode(HttpStatus.INTERNAL_SERVER_ERROR.toString());
//        String url=webRequest.getDescription(false);
//        errorInfo.setUrl(url);
//        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(errorInfo);
//    }



    //handler to handler which ex : productNotFOundEx
    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<ErrorInfo> handle404(ResourceNotFoundException ex, WebRequest webRequest){

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
