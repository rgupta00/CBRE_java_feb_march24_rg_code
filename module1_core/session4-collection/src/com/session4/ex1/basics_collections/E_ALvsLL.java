package com.session4.ex1.basics_collections;

public class E_ALvsLL {
	
	public static void main(String[] args) {
		List<String> list=new LinkedList<>();
		list.add("foo");
		list.add("bar");
		list.add("jar");
		
		//System.out.println(list);
		
		//one by one: using enhance for loop
		
		for(String data: list){
			System.out.println(data);
		}
		
		
		
		
	}

}
