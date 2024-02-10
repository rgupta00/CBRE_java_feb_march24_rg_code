package com.dp.creational.d.simple_factory_method;

import java.io.InputStream;

public class MySqlConnectionFactory extends ConnectionFactory {

	@Override
	public InputStream getInputStream() {

		return MySqlConnectionFactory.class.getClassLoader()
				.getResourceAsStream("db-mysql.properties");
	}

}
