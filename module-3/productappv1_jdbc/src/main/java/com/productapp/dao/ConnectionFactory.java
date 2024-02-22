package com.productapp.dao;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionFactory {
    private static Connection connection=null;

    public static Connection getConnection(){
        //now we need to get data from prop file
        Properties properties=new Properties();
        InputStream is=ConnectionFactory.class.getClassLoader().getResourceAsStream("db.properties");
        try {
            properties.load(is);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        String username=properties.getProperty("db.username");
        String password=properties.getProperty("db.password");
        String url=properties.getProperty("db.url");
        String drivername=properties.getProperty("db.drivername");

        try {
            Class.forName(drivername);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        try {
            connection=DriverManager.getConnection
                    (url,username,password);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return  connection;
    }
}
