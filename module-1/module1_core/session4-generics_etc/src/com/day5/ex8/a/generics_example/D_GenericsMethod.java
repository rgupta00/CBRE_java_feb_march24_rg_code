package com.day5.ex8.a.generics_example;
//generics method ..
//to compare "any" three object
public class D_GenericsMethod {

	public static void main(String[] args) {
		Integer a, b, c;

		a=11;
		b=4000;
		c=-111;

		Integer maxValue=max(a, b , c);
		System.out.println(maxValue);
//		Double a, b, c;
//
//		a=11.0;
//		b=4000.9;
//		c=-111.9;
//
//		Double maxValue=max(a, b , c);
//		System.out.println(maxValue);

	}
	public static <T extends Comparable<T>>   T max(T a, T b, T c){
		T max=a;
		if(b.compareTo(max)>0){
			max=b;
		}
		if(c.compareTo(max)>0){
			max=c;
		}
		return max;
	}


}




