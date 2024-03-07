package com.productapp.dto;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Range;

import java.math.BigDecimal;

//used to intract with ui, validation
@NoArgsConstructor
@AllArgsConstructor
@Data
public class ProductDto {

    private Integer id;

    @NotEmpty(message = "{productDto.name.absent}")
    private String name;
    @NotNull(message = "{productDto.price.absent}")
    @Range(min = 10, max = 15_000_0, message = "{productDto.price.invalid}")
    private BigDecimal price;

    public ProductDto(String name, BigDecimal price) {
        super();
        this.name = name;
        this.price = price;
    }

}