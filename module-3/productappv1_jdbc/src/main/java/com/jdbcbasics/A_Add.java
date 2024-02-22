package com.jdbcbasics;

import java.sql.*;

public class A_Add {
    public static void main(String[] args) {
        //1. load the driver

        //connection object
        Connection connection=null;
        try {
            connection=ConnectionFactory.getConnection();

            PreparedStatement pstmt=connection.prepareStatement("insert into products(name, price) values (?,?)");
            pstmt.setString(1,"coolpad");
            pstmt.setDouble(2,2200);


          int noOfRowsEffected= pstmt.executeUpdate();

            System.out.println(noOfRowsEffected);



        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }finally {
            if(connection!=null){
                try {
                    connection.close();
                } catch (SQLException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }
}
