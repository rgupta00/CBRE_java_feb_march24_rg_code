package com.dp.creational.d.strategy;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

class ConnectionFactory {

	private InputStream inputStream;

	public ConnectionFactory() {
		inputStream=ConnectionFactory.class.getClassLoader()
				.getResourceAsStream("db-mysql.properties");
	}
	
	public void setInputStream(InputStream inputStream) {
		this.inputStream = inputStream;
	}

	private Connection connection = null;

	public Connection getConnection() {
		// You can read a prop file
		Properties prop = new Properties();

		try {
			prop.load(inputStream);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String driver = prop.getProperty("driver");
		String url = prop.getProperty("url");
		String user = prop.getProperty("user");
		String password = prop.getProperty("password");

		try {
			Class.forName(driver);
			System.out.println("driver is loaded");
		} catch (ClassNotFoundException ex) {
			ex.printStackTrace();
		}

		try {
			connection = DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return connection;
	}

}