package com.productapp.service;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductServiceImplTest {

    private ProductService productService;

    @BeforeEach
    void setUp() {
        productService=new ProductServiceImpl();
    }

    @Test
    void getAll() {
        Assertions.assertEquals(2, productService.getAll().size());
    }

    @Test
    void addProduct() {
    }

    @Test
    void deleteProduct() {
    }

    @Test
    void updateProduct() {
    }

    @Test
    void getById() {
    }


    @AfterEach
    void tearDown() {
        productService=null;
    }
}