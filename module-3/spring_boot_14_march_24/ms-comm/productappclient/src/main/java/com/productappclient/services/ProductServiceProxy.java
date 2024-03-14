package com.productappclient.services;

import com.productappclient.dto.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@FeignClient(name = "productserviceproxy", url = "http://localhost:8090/productapp")
public interface ProductServiceProxy {

    @GetMapping(path = "products")
    public List<Product> getAll();

    //http://localhost:8090/productapp/products/1
    @GetMapping(path = "products/{id}")
    public Product getProductById(@PathVariable int id);

    @PostMapping(path = "products")
    public ResponseEntity<Product> addProduct(@RequestBody Product product);

    @PutMapping(path = "products/{id}")
    public Product updateProduct(@PathVariable int id,   @RequestBody Product product);
    //delete
    @DeleteMapping(path = "products/{id}")
    public ResponseEntity<Void> deleteProductById(@PathVariable int id);
}
