package com.productapp.repo;

import com.productapp.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

//Declartive dao layer
//u dont have to write much code :)
@Repository
public interface ProductRepo extends JpaRepository<Product, Integer> {
    //spring data quary gen method
    public Optional<Product>  findByName(String name);
    public Optional<Product> findByNameAndPrice(String name, double price);

    //@Query annntation
    @Query("select p from Product p")
    public List<Product> getProducts();


    @Query("select p from Product p where p.name=?1")
    List<Product> getListOfAllProductsBasedOnName(String name);

    @Query("select p from Product p where p.name=:name")
    List<Product> getListOfAllProductsBasedOnNameV2(@Param("name")  String productName);


    @Query("select p from Product p where p.name=?1 and p.price=?2")
    List<Product> getListOfAllProductsBasedOnNameAndPrice(String name, double price);

    @Query("select p from Product p where p.name=?1 or p.price=?2")
    List<Product> getListOfAllProductsBasedOnNameOrPrice(String name, double price);
}
