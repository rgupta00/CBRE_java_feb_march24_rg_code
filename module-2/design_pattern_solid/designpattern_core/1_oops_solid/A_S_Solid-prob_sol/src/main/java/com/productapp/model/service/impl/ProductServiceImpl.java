package com.productapp.model.service.impl;

import java.sql.SQLException;

import com.productapp.model.dao.ProductDao;
import com.productapp.model.dao.impl.ProductDaoHibImpl;
import com.productapp.model.dao.impl.ProductDaoJdbcImpl;
import com.productapp.model.dto.Product;
import com.productapp.model.service.ProductService;
import com.productapp.model.service.util.DataValidation;

public class ProductServiceImpl implements ProductService {

	private DataValidation dataValidation;

	private ProductDao productDao;

	//DI
	public ProductServiceImpl() {
		productDao = new ProductDaoJdbcImpl();
		dataValidation = new DataValidation();
	}

	@Override
	public void addProduct(Product product){

		if (dataValidation.valiation(product)) {
			productDao.addProduct(product);
		}

	}
}
