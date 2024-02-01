package com.day5.ex4.map_example;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class D_UsingTreeMap {
	
	public static void main(String[] args) {
		Map<String, Integer> map=new TreeMap<>(( o1,  o2)-> o2.compareTo(o1));
		map.put("ekta", 80);
		map.put("gunika", 100);
		map.put("raj", 84);
		map.put("keshav", 90);
		map.putIfAbsent("keshav", 89);
		

		
	}

}
