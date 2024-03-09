package com.productapp.dto;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Range;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductDto {
	@Id
	private Integer id;
	
	@NotNull(message="{product.name.absent}")
	@Pattern(regexp ="[A-za-z]{5,50}", message="{product.name.invalid}")
	private String name;
	
	@NotNull(message="{product.price.absent}")
	@Range(min = 10, max = 100000, message = "{product.price.invalid}")
	private BigDecimal price;

	public ProductDto(String name, BigDecimal price) {
		super();
		this.name = name;
		this.price = price;

	}

}
