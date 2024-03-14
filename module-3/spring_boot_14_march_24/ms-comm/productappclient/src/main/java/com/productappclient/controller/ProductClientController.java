package com.productappclient.controller;

import com.productappclient.dto.Product;
import com.productappclient.services.ProductServiceProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class ProductClientController {

//    @Autowired
//    private RestTemplate restTemplate;

    @Autowired
    private ProductServiceProxy productServiceProxy;

    @GetMapping(path = "productsclient/{id}")
    public Product getById(@PathVariable int id){
        return  productServiceProxy.getProductById(id);
    }
    @GetMapping(path = "productsclient")
    public List<Product> getAll(){
        return productServiceProxy.getAll();
    }

}








//        //hard coding of url
////        return restTemplate.getForObject("http://localhost:8090/productapp/products/"+id , Product.class);
//        ResponseEntity<Product> forEntity = restTemplate.getForEntity("http://localhost:8090/productapp/products/" + id, Product.class);
//        System.out.println(forEntity.getStatusCode());
//        return  forEntity.getBody();