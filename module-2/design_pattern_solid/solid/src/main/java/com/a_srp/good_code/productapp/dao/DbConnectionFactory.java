package com.a_srp.good_code.productapp.dao;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DbConnectionFactory {

    public static Connection getConnection() {
        Connection connection = null;
        Properties prop = new Properties();// aka hashtable,,used to load prop file
        InputStream is;
        try {
          //  is = com.a_srp.bad_code.Product.class.getClassLoader().getResourceAsStream("db.properties");

            is=DbConnectionFactory.class.getClassLoader().getResourceAsStream("db.properties");
            prop.load(is);// this will get key and values

        } catch (IOException e1) {

            e1.printStackTrace();
        }

        String driverName = prop.getProperty("jdbc.driver");
        System.out.println(driverName);
        String url = prop.getProperty("jdbc.url");
        String username = prop.getProperty("jdbc.username");
        String password = prop.getProperty("jdbc.password");

        try {
            Class.forName(driverName);// this is dynamic class loading
            System.out.println("driver is loaded");
        } catch (ClassNotFoundException ex) {
            System.out.println("driver loading is not working");
        }

        try {
            connection = DriverManager.getConnection(url, username, password);
            System.out.println("-------------");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }
}
