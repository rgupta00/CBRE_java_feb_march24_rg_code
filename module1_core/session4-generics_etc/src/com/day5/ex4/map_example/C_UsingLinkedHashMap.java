package com.day5.ex4.map_example;

import java.util.LinkedHashMap;
import java.util.Map;

public class C_UsingLinkedHashMap {
	
	public static void main(String[] args) {
		Map<String, Integer> map=new LinkedHashMap<>();
		map.put("ekta", 80);
		map.put("gunika", 100);
		map.put("raj", 84);
		map.put("keshav", 90);
		map.putIfAbsent("keshav", 89);

		
	}

}
