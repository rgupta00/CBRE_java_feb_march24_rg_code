package com.dp.creational.d.factory_method;

import java.io.InputStream;

public class PostgresConnectionFactory extends JdbcConnectionFactory {
    @Override
    public InputStream getInputStream() {
        InputStream is= PostgresConnectionFactory.class.getClassLoader()
                .getResourceAsStream("postgress.properties");

        return is;
    }
}
