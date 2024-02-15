package com.dp.creational.d.simple_factory.sol;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
//Simple factory pattern
public class JdbcConnectionFactory {
    private static Connection connection;

    //loose coupling-properties files
    public static Connection getConnection(){
        //i need to write code so that i can read it from prop file
        Properties properties=new Properties();
        InputStream is=JdbcConnectionFactory.class.getClassLoader().getResourceAsStream("mysql.properties");

        try {
            properties.load(is);// i am reading prop file and putting that into Properties object
            //it will seprate into k and v
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        String url=properties.getProperty("url");
        String username=properties.getProperty("username");
        String password=properties.getProperty("password");
        String driver=properties.getProperty("driver");


        try {
            Class.forName(driver);
            connection= DriverManager.getConnection(url,
                    username, password);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return connection;
    }
}
