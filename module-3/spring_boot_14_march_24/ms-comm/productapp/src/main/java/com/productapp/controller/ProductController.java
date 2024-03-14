package com.productapp.controller;

import com.productapp.entities.Product;
import com.productapp.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    public List<Product> getAll(){
        return productService.findAll();
    }

    //get by id
    @GetMapping(path = "products/{id}")
    public Product getProductById(@PathVariable int id){
        return productService.getById(id);
    }
    //ResponseEntity= data + status code

    //add product
    @PostMapping(path = "products")
    public ResponseEntity<Product> addProduct(@RequestBody Product product){
        Product p= productService.addProduct(product);
        return ResponseEntity.status(HttpStatus.CREATED).body(p);
    }
    //update product
    @PutMapping(path = "products/{id}")
    public Product updateProduct(@PathVariable int id,   @RequestBody Product product){
        return productService.updateProduct(id, product);
    }

    //delete
    @DeleteMapping(path = "products/{id}")
    public ResponseEntity<Void> deleteProductById(@PathVariable int id){
        Product productDeleted= productService.deleteProduct(id);

        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

    @GetMapping(path = "productsorted")
    public List<Product> getAllProductSorted(@RequestParam(name="field")  String field) {
        return productService.getAllProductSorted(field);
    }

    //productpage?offset=4&pageSize=20
    @GetMapping(path = "productpage")
    public Page<Product> getAllProductPage(@RequestParam(name="offset") int offset, @RequestParam(name="pageSize") int pageSize) {
        return productService.getAllProductPage(offset, pageSize);
    }

    //productpagesorted?offset=4&pageSize=20&field=id
    @GetMapping(path = "productpagesorted")
    public Page<Product> getAllProductPageSorted(int offset, int pageSize,String field) {
        return productService.getAllProductPageSorted(field, offset, pageSize);
    }
}
