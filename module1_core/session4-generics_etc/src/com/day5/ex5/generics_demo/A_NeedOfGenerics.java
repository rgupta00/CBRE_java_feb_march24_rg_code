package com.day5.ex5.generics_demo;
import java.util.*;
public class A_NeedOfGenerics {
	
	public static void main(String[] args) {
		//java 5, type erased...
		int sum=0;
		List<Integer> list=getList();

		for(Integer temp:list){
				sum += temp;
		}
		System.out.println(sum);


	}

	//ravi
	public static List getList(){
		List<Integer> list=new ArrayList<>();
		list.add(33);
		list.add(33);

		return  list;
	}

}
