package com.dp.behavioural.e.strategy_dp;

import java.util.ArrayList;
import java.util.List;

public class Cart {
	private List<Product> productList = new ArrayList<>();
	private double totalCartValue;


	public void addProduct(Product product) {
		productList.add(product);
	} 
	

	public int getProductCount(){
		return productList.size();
	}
	
	public double getTotalCartValue(){
		if(productList.size()> 0){
			for(Product p: productList){
				totalCartValue=totalCartValue+p.getPrice()*p.getQuantity();
			}
		}
			
		return totalCartValue;
	}
}