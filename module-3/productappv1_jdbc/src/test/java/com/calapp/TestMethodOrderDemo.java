package com.calapp;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class TestMethodOrderDemo {


    @Order(value = 1)
    @Test
    public void addProduct(){
        System.out.println("add");
    }

    @Order(value = 2)
    @Test
    public void showProduct(){
        System.out.println("show");
    }

    @Order(value = 3)
    @Test
    public void updateProduct(){
        System.out.println("update");
    }

    @Order(value = 4)
    @Test
    public void deleteProduct(){
        System.out.println("delete");
    }



}
