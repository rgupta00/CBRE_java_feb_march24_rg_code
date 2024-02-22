package com.jdbcbasics;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class D_Delete {
    public static void main(String[] args) {
        //1. load the driver

        //connection object
        Connection connection=null;
        try {
            connection=ConnectionFactory.getConnection();

            PreparedStatement pstmt=connection.prepareStatement("delete from products where id=?");
            pstmt.setInt(1,3);


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
