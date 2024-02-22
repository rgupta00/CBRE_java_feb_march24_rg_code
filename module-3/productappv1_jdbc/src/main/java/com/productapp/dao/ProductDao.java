package com.productapp.dao;

import java.util.List;

public interface ProductDao {
    public List<Product> getAll();
    public void addProduct(Product product);
    public void deleteProduct(int id);
    public void updateProduct(int id, Product product);
    public Product getById(int id);
}
