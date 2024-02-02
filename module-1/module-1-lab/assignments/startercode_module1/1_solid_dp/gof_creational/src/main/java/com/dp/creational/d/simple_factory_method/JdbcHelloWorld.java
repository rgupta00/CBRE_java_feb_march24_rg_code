package com.dp.creational.d.simple_factory_method;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcHelloWorld {

	public static void main(String[] args) {
		

		Connection connection = null;
		try {
			ConnectionFactory connectionFactory=new MySqlConnectionFactory();
			
			connection = connectionFactory.getConnection();
			System.out.println("conn is done");
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery("select * from product");
			while (rs.next()) {
				System.out.println(rs.getInt(1) + ": " + rs.getString(2) + ": " + rs.getDouble(3));
			}
		} catch (SQLException ex) {
			ex.printStackTrace();
		} finally {
			if (connection != null) {
				try {
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
}
