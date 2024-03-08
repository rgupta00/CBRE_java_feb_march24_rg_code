package com.productapp.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import lombok.*;
import org.hibernate.validator.constraints.Range;

import java.math.BigDecimal;

//used to interact with db
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

    //EL, FMCG,BOOKS
    private String productType;


    public Product(String name, BigDecimal price) {
        super();
        this.name = name;
        this.price = price;
    }

}