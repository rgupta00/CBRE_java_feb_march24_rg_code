package com.dp.creational.d.simple_factory_method;

import java.io.InputStream;

public class PostgressConnectionFactory extends ConnectionFactory {

	@Override
	public InputStream getInputStream() {

		return PostgressConnectionFactory.class.getClassLoader()
				.getResourceAsStream("db-postgress.properties");
	}

}
