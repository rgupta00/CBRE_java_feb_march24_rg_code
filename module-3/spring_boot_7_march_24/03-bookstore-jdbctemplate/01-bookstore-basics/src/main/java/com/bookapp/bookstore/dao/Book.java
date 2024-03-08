package com.bookapp.bookstore.dao;

import lombok.*;

import java.util.Optional;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Book  {
	private long id;
	private String isbn;
	private String title;
	private String author;
	private double price;


}
