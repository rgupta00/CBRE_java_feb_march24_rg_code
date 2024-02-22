package com.productapp.service;

import com.productapp.dao.Product;
import com.productapp.exceptions.DataAccessException;

import java.util.List;

public interface ProductService {
    public List<Product> getAll();
    public void addProduct(Product product);
    public void deleteProduct(int id);
    public void updateProduct(int id, Product product);
    public Product getById(int id);
}
