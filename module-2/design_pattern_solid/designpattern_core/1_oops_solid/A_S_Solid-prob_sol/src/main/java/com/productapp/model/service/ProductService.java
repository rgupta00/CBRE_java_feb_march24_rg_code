package com.productapp.model.service;

import java.sql.SQLException;

import com.productapp.model.dto.Product;
import com.productapp.model.exceptions.DataAccessException;

public interface ProductService {
	public void addProduct(Product product) ;
}
