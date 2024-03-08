package com.bankapp.exceptions;
//serial versaion id: serilization

public class ResourceNotFoundException extends RuntimeException{

    public ResourceNotFoundException(String message) {
        super(message);
    }
}
