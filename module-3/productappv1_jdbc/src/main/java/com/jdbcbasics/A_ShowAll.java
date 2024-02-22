package com.jdbcbasics;

import java.sql.*;

public class A_ShowAll {
    public static void main(String[] args) {
        //1. load the driver

        //connection object
        Connection connection=null;
        try {
            connection=ConnectionFactory.getConnection();
            //i wnat to get all the records
            //Statement "SQL injection"
          //  PreparedStatement
          //  CallableStatement(store procedural)
            Statement stmt=connection.createStatement();
            //executeQuery vs executeUpdate
            //fetch       vs    update/delete/add
            ResultSet rs=stmt.executeQuery("select * from products");

            while (rs.next()){
                System.out.println(rs.getInt(1)+": "+ rs.getString(2)+": "+ rs.getDouble(3));
            }


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
