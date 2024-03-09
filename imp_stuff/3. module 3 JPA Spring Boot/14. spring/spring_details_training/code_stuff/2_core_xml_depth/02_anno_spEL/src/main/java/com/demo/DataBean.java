package com.demo;
import java.util.*;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component(value = "dataBean")
public class DataBean {
	@Value("#{cities}")
	private List<String>cities;
	
	@Value("#{22+26-1}")
	private int x;
	
	@Value("#{T(java.lang.Math).sqrt(144)}")
	private double y;
	
	@Value("#{T(java.lang.Math).PI}")
	private double z;
	
	@Value("#{new java.lang.String('java champs')}")
	private String name;
	
	@Value("#{8>2}")
	private boolean status;

	@Override
	public String toString() {
		return "DataBean [cities=" + cities + ", x=" + x + ", y=" + y + ", z=" + z + ", name=" + name + ", status="
				+ status + "]";
	}
}
