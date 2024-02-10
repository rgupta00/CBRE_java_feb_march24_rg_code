package com.productapp.model.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.productapp.model.dao.ProductDao;
import com.productapp.model.dao.factories.JdbcConnectionFactory;
import com.productapp.model.dto.Product;
import com.productapp.model.exceptions.DataAccessException;

public class ProductDaoJdbcImpl implements ProductDao {

	private Connection connection;
	
	public ProductDaoJdbcImpl() {
		connection=JdbcConnectionFactory.getConnection();
	}
	@Override
	public void addProduct(Product product)   {
		try {
			PreparedStatement pstmt = connection.prepareStatement("insert into product(name,price) values(?,?)");
			pstmt.setString(1, product.getName());
			pstmt.setDouble(2, product.getPrice());

			pstmt.executeUpdate();
			System.out.println("adding product to db using jdbc..");
		}catch(SQLException ex) {
			throw new DataAccessException("some jdbc ex",ex);
		}
	}

}
