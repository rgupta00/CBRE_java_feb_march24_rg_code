package com.productapp.service;

import com.productapp.entities.Product;
import org.springframework.data.domain.Page;

import java.util.List;

public interface ProductService {
	public List<Product> findAll();
	public Product getById(int id);
	public Product addProduct(Product product);
	public Product updateProduct(int id, Product product);
	public Product deleteProduct(int id);

	public List<Product> getAllProductSorted(String field);
	public Page<Product> getAllProductPage(int offset, int pageSize);
	public Page<Product> getAllProductPageSorted(String field,int offset, int pageSize);

	public void invalidateCache();
}