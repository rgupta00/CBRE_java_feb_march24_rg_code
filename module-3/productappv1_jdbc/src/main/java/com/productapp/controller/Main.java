package com.productapp.controller;

import com.productapp.dao.Product;
import com.productapp.service.ProductService;
import com.productapp.service.ProductServiceImpl;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        ProductService productService=new ProductServiceImpl();
        List<Product> products=productService.getAll();
        products.forEach(p-> System.out.println(p));

//        Product product=new Product("tea",200);
//        productService.addProduct(product);

//      Product product=productService.getById(4);
//      product.setPrice(product.getPrice()*1.2);
//      System.out.println(product);
//
//        //update
//        productService.updateProduct(4, product);

        //delete
       // productService.deleteProduct(4);

    }
}
