package com.a_srp.bad_code;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;

//GOD class--- 
class Product {
	private int id;
	private String name;
	private double price;

	public boolean valiation() {
		return true;
	}

	public Product(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}

	public Connection getConnection() {
		Connection connection = null;
		Properties prop = new Properties();// aka hashtable,,used to load prop file
		InputStream is;
		try {
			is = Product.class.getClassLoader().getResourceAsStream("db.properties");

			prop.load(is);// this will get key and values

		} catch (IOException e1) {

			e1.printStackTrace();
		}

		String driverName = prop.getProperty("jdbc.driver");
		System.out.println(driverName);
		String url = prop.getProperty("jdbc.url");
		String username = prop.getProperty("jdbc.username");
		String password = prop.getProperty("jdbc.password");

		try {
			Class.forName(driverName);// this is dynamic class loading
			System.out.println("driver is loaded");
		} catch (ClassNotFoundException ex) {
			System.out.println("driver loading is not working");
		}

		try {
			connection = DriverManager.getConnection(url, username, password);
			System.out.println("-------------");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return connection;
	}

	public SessionFactory getFactory() {
		// code to get jdbc connection..
		return null;
	}

	public void addProduct() throws SQLException {
		Connection connection = getConnection();
		PreparedStatement pstmt = connection.prepareStatement("insert into product(name,price) values(?,?)");
		pstmt.setString(1, name);
		pstmt.setDouble(2, price);

		pstmt.executeUpdate();
		System.out.println("adding product to db using jdbc..");

	}

	public void addProductUsingHibernate(Product product) throws HibernateException {
		System.out.println("adding book to db using hibernate....");
	}
}
