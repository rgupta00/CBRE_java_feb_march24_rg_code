package com.a_srp.good_code.productapp.controller;

import com.a_srp.good_code.productapp.dao.Product;
import com.a_srp.good_code.productapp.service.ProductService;
import com.a_srp.good_code.productapp.service.ProductServiceImpl;

public class Main {
    public static void main(String[] args) {
        ProductService productService=new ProductServiceImpl();
        productService.addProduct(new Product("thinkpad",120000));

    }
}
