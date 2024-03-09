package com.productapp.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.productapp.entity.Product;
@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

}
