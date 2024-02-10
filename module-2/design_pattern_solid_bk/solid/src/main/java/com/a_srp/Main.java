package com.a_srp;

import java.sql.SQLException;

public class Main {

	public static void main(String[] args) throws SQLException {
		Product product=new Product("mouse",700.00);
		product.addProduct();
	}
}
