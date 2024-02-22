package com.productapp.exceptions;

public class ProductNotFoundExcetion extends RuntimeException{
    public ProductNotFoundExcetion(String message) {
        super(message);
    }
}
