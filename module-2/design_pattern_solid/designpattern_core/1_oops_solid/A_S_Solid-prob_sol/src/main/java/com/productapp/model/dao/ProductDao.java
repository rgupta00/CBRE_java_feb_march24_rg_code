package com.productapp.model.dao;

import java.sql.SQLException;

import com.productapp.model.dto.Product;
import com.productapp.model.exceptions.DataAccessException;

public interface ProductDao {
	public void addProduct(Product product);
}
