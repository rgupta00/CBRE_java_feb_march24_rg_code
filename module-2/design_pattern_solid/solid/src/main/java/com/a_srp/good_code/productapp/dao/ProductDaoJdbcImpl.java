package com.a_srp.good_code.productapp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ProductDaoJdbcImpl implements ProductDao{

    private Connection connection;
    public ProductDaoJdbcImpl(){
        connection=DbConnectionFactory.getConnection();
    }

    @Override
    public void saveProduct(Product product) {

      try{
          PreparedStatement pstmt = connection.prepareStatement("insert into product(name,price) values(?,?)");
          pstmt.setString(1, product.getName());
          pstmt.setDouble(2, product.getPrice());

          pstmt.executeUpdate();
          System.out.println("adding product to db using jdbc..");
      }catch (SQLException e){
          e.printStackTrace();
      }
    }
}
