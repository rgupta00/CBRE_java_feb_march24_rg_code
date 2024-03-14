package com.productappclient.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
@Data
public class Product {
    private Integer id;
    private String name;

    private double price;

    public Product(String name, double price) {
        super();
        this.name = name;
        this.price = price;
    }

}