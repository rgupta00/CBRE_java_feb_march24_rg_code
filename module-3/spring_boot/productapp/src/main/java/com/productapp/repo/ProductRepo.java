package com.productapp.repo;

import com.productapp.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
//Declartive dao layer
@Repository
public interface ProductRepo extends JpaRepository<Product, Integer> {
}
