package com.productapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.productapp.entity.Product;
import com.productapp.repo.ProductRepository;
@Service
public class ProductServiceImpl implements ProductService{

	@Autowired
	private ProductRepository productRepository;
	
	
	@Override
	public List<Product> getAll() {
		return productRepository.findAll();
	}

	@Override
	public List<Product> getAllSortedAsPerName(String name) {
		return productRepository.findAll(Sort.by(Sort.Direction.DESC, name));
	}

	@Override
	public Page<Product> findProductsWithPagination(int offSet, int pageSize) {
		Page<Product> pageList=productRepository.findAll(PageRequest.of(offSet, pageSize));
		return pageList;
	}

	@Override
	public Page<Product> findProductsWithPaginationAndSorting(int offSet, int pageSize, String field) {
		Page<Product> pageList=productRepository.findAll(PageRequest.of(offSet, pageSize).withSort(Sort.by(field)));
		return pageList;
	}

}



