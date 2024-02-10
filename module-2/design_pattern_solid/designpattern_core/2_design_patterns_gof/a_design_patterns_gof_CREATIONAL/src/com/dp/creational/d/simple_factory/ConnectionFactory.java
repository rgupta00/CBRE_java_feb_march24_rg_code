package com.dp.creational.d.simple_factory;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionFactory {

	private static Connection connection = null;

	public static Connection getConnection(String databaseType) {
		// You can read a prop file
		Properties prop = new Properties();
		// FileInputStream in = new FileInputStream
		InputStream inputStream = null;

		if(databaseType.equalsIgnoreCase("mysql")) {
			inputStream = ConnectionFactory.class.getClassLoader()
					.getResourceAsStream("db-mysql.properties");
		}
		else if(databaseType.equalsIgnoreCase("oracle")) {
			inputStream = ConnectionFactory.class.getClassLoader()
					.getResourceAsStream("db-oracle.properties");
		}
		else if(databaseType.equalsIgnoreCase("postgress")) {
			inputStream = ConnectionFactory.class.getClassLoader()
					.getResourceAsStream("db-oracle.properties");
		}
		
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
			connection = DriverManager.getConnection(url,user, password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return connection;
	}

}