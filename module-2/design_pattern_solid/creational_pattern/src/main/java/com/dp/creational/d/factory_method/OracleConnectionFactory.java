package com.dp.creational.d.factory_method;

import java.io.InputStream;

public class OracleConnectionFactory extends JdbcConnectionFactory {
    @Override
    public InputStream getInputStream() {
        InputStream is= OracleConnectionFactory.class.getClassLoader()
                .getResourceAsStream("oracle.properties");

        return is;
    }
}
