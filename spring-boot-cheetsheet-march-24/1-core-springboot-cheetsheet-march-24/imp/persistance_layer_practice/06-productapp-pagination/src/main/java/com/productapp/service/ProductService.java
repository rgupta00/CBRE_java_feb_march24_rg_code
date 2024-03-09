package com.productapp.service;
import java.util.*;

import org.springframework.data.domain.Page;

import com.productapp.entity.Product;
public interface ProductService {
	
	public List<Product> getAll();
	public List<Product> getAllSortedAsPerName(String name);
								//offset		pageSize
	public Page<Product> findProductsWithPagination(int offSet, int pageSize);
	
	public Page<Product> findProductsWithPaginationAndSorting(int offSet, int pageSize, String field);//*
	
	

}
