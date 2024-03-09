package com.productapp.dao;

import java.math.BigDecimal;
import java.util.*;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;
@Repository
@Primary
public class ProductDaoMapImpl implements ProductDao{

	private HashMap<Integer, Product> productsMap;
	private int counter=0;
	public ProductDaoMapImpl() {
		productsMap=new HashMap<Integer, Product>();
		productsMap.put(1, new Product(1, "desktop", new BigDecimal(55000), true));
		productsMap.put(2, new Product(1, "Mouse pad", new BigDecimal(550), true));
		productsMap.put(3, new Product(1, "Torch", new BigDecimal(520), false));
		counter=3;
		
		
	}
	
	@Override
	public List<Product> getAll() {
		System.out.println("-------hashmap-------");
		return new ArrayList<Product>(productsMap.values());
	}

	@Override
	public Product getById(Integer id) {
		return productsMap.get(id);
	}

	@Override
	public Product addProduct(Product product) {
		++counter;
		product.setId(counter);
		productsMap.put(counter,product );
		return product;
	}

	@Override
	public Product deleteProduct(Integer id) {
		Product productToDelete=null;
		if(productsMap.containsKey(id)) {
			productToDelete=productsMap.get(id);
			productsMap.remove(id);
		}
		return productToDelete;
	}

	@Override
	public Product updateProduct(Integer id, Product product) {
		Product productToUpdate=null;
		if(productsMap.containsKey(id)) {
			productToUpdate=productsMap.get(id);
			productToUpdate.setPrice(product.getPrice());
			productToUpdate.setAvailable(product.isAvailable());
			productsMap.put(id, productToUpdate);
		}
		return productToUpdate;
	}

}
