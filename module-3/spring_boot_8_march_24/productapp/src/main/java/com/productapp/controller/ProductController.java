package com.productapp.controller;

import com.productapp.dto.ProductDto;
import com.productapp.entities.Product;
import com.productapp.service.ProductService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    private ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }
    //get all products
    @GetMapping(path = "products")
    public ResponseEntity<List<ProductDto>> getAll(){
        return ResponseEntity.status(HttpStatus.OK).body(productService.findAll());
    }
    //get by id
    @GetMapping(path = "products/{id}")
    public ResponseEntity<ProductDto> getById(@PathVariable  int id){
        return ResponseEntity.status(HttpStatus.OK).body(productService.getById(id));
    }

    //ResponseEntity= data + status code

    //add product
    @PostMapping(path = "products")
    public ResponseEntity<ProductDto> addProduct( @Valid @RequestBody ProductDto productDto){
        ProductDto productDto1=productService.addProduct(productDto);
        return ResponseEntity.status(HttpStatus.CREATED).body(productDto1);
    }

    //update product
    @PutMapping(path = "products/{id}")
    public ResponseEntity<ProductDto> updateProduct(@PathVariable  int id,  @Valid @RequestBody ProductDto productDto){
        return ResponseEntity.status(HttpStatus.OK).body(productService.updateProduct(id, productDto));
    }

    //delete 204
    @DeleteMapping(path = "products/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable  int id){
        ProductDto productDtoDeleted= productService.deleteProduct(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();

    }

}
