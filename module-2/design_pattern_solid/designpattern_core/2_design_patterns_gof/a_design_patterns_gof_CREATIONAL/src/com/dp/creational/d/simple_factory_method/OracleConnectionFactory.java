package com.dp.creational.d.simple_factory_method;

import java.io.InputStream;

public class OracleConnectionFactory extends ConnectionFactory {

	@Override
	public InputStream getInputStream() {

		return OracleConnectionFactory.class.getClassLoader()
				.getResourceAsStream("db-oracle.properties");
	}

}
