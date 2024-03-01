package com.productapp.model.entities;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@ToString
@AllArgsConstructor

@Entity
@Table(name = "product_table_new")
@Builder
public class Product {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id")
    private  Integer id;

    @Column(name = "product_name", nullable = false)
    private String name;

    @Column(name = "product_price" , nullable = false)
    private BigDecimal price;
}













