package com.productapp.dao;
import java.util.*;
public interface ProductDao {
	public List<Product> getAll();
	public Product getById(Integer id );
	public Product addProduct(Product product);
	public Product deleteProduct(Integer id );
	public Product updateProduct(Integer id, Product product );
}
