package com.session4.ex8.a.generics_example;

public class DemoGenerics {
	
	public static void main(String[] args) {
		//1.GPP dont mix generics and non generic code
		//dont mix milk with wine
		
		//never ever do this: dont mix generics and non generic code
		//BUGS
		
		List<Integer> list=new ArrayList<Integer>();
		
		list.add(66);
		list.add(31);
		
	}



}



