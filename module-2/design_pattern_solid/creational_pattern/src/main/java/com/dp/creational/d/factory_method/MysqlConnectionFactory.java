package com.dp.creational.d.factory_method;

import java.io.InputStream;

public class MysqlConnectionFactory extends JdbcConnectionFactory {
    @Override
    public InputStream getInputStream() {
        InputStream is= MysqlConnectionFactory.class.getClassLoader()
                .getResourceAsStream("mysql.properties");

        return is;
    }
}
