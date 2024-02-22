package com.productapp.dao;

import com.jdbcbasics.ConnectionFactory;
import com.productapp.exceptions.DataAccessException;

import java.sql.*;
import java.util.LinkedList;
import java.util.List;

public class ProductDaoImpl implements ProductDao{

    private Connection connection;

    public ProductDaoImpl(){
        connection= ConnectionFactory.getConnection();
    }
    @Override
    public List<Product> getAll() {
        List<Product> products=new LinkedList<>();
       try{
           Statement stmt=connection.createStatement();
           ResultSet rs=stmt.executeQuery("select * from products");
           while (rs.next()){
               products.add(new Product(rs.getInt(1), rs.getString(2), rs.getDouble(3)));
           }

       }catch (SQLException e){
          throw  new DataAccessException(e.getMessage(), e);
       }
        return products;
    }

    @Override
    public void addProduct(Product product) {
        try{
            PreparedStatement pstmt=connection.prepareStatement("insert into products(name, price) values (?,?)");
            pstmt.setString(1,product.getName());
            pstmt.setDouble(2,product.getPrice());

            pstmt.executeUpdate();

        }catch (SQLException e){
            throw  new DataAccessException(e.getMessage(), e);
        }
    }

    @Override
    public void deleteProduct(int id) {
        try{
            PreparedStatement pstmt=connection.prepareStatement("delete from products where id=?");
            pstmt.setInt(1,id);
           pstmt.executeUpdate();
        }catch (SQLException e){
            throw  new DataAccessException(e.getMessage(), e);
        }
    }

    @Override
    public void updateProduct(int id, Product product) {
        try{
            PreparedStatement pstmt=connection.prepareStatement("update products set price=? where id=?");
            pstmt.setDouble(1,product.getPrice());
            pstmt.setInt(2,id);
            pstmt.executeUpdate();

        }catch (SQLException e){
            throw  new DataAccessException(e.getMessage(), e);
        }
    }

    @Override
    public Product getById(int id) {
       Product product=null;
        try{
            PreparedStatement ptmt=connection.prepareStatement("select * from products where id=?");
            ptmt.setInt(1,id);
            ResultSet rs=ptmt.executeQuery();
            if (rs.next()){
                product=new Product(rs.getInt(1), rs.getString(2), rs.getDouble(3));
            }

        }catch (SQLException e){
            throw  new DataAccessException(e.getMessage(), e);
        }
        return product;
    }
}
