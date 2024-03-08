package com.productapp.entities;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;


@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "product_table")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;

    private BigDecimal price;

    public Product(String name, BigDecimal price) {
        super();
        this.name = name;
        this.price = price;
    }

}