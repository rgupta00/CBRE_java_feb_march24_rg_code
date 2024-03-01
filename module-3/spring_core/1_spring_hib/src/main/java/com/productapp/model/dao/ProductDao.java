package com.productapp.model.dao;

import com.productapp.model.entities.Product;

import java.util.List;

public interface ProductDao {
    public List<Product> getAll();
    public Product addProduct(Product product);
    public Product updateProduct(int productId, Product product);
    public Product deleteProduct(int productId);
    public Product getProductById(int productId);


}
