package com.productapp.util;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
//
//public class ConnectionFactory {
//	private static Connection connection;
//
//	public static Connection getConnection() {
//		// read the property file, and load into Properties object
//		InputStream is = ConnectionFactory.class.getClassLoader().getResourceAsStream("db.properties");
//
//		Properties properties = new Properties();
//
//		try {
//			properties.load(is);
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//
//		String driver = properties.getProperty("jdbc.driver");
//		String url = properties.getProperty("jdbc.url");
//		String username = properties.getProperty("jdbc.username");
//		String password = properties.getProperty("jdbc.password");
//
//		// load the driver
//		try {
//			Class.forName(driver);
//		} catch (ClassNotFoundException e) {
//			e.printStackTrace();
//		}
//		// create a connection and
//		try {
//			connection = DriverManager.getConnection(url, username, password);
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//		// return the connection
//		return connection;
//	}
//}
