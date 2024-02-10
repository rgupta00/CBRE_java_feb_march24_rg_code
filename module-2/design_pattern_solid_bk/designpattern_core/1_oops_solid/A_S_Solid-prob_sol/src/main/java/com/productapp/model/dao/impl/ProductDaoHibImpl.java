package com.productapp.model.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.hibernate.HibernateException;

import com.productapp.model.dao.ProductDao;
import com.productapp.model.dao.factories.JdbcConnectionFactory;
import com.productapp.model.dto.Product;
import com.productapp.model.exceptions.DataAccessException;

public class ProductDaoHibImpl implements ProductDao {

	private Connection connection;
	
	public ProductDaoHibImpl() {
		connection=JdbcConnectionFactory.getConnection();
	}
	@Override
	public void addProduct(Product product)   {
		try {
			//some hibernate code
			
			System.out.println("adding product to db using hib..");
			if(1==2)
				throw new HibernateException("some hib issue");
			
		}catch(HibernateException ex) {
			throw new DataAccessException("some jdbc ex",ex);
		}
	}

}
