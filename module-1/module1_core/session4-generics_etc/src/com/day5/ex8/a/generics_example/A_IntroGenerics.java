package com.day5.ex8.a.generics_example;
import java.util.*;
public class A_IntroGenerics {
	
	public static void main(String[] args) {
		//1.GPP dont mix generics and non generic code
		//dont mix milk with wine
		
		//never ever do this: dont mix generics and non generic code
		//BUGS
		//A-Z
		//java 5

		int total=0;
//		List list=getList();
//		Iterator it=list.iterator();
//		while (it.hasNext()){
//			total+=(Integer)it.next();
//		}
//		System.out.println(total);

//		List<Integer> list=getList();
//		Iterator<Integer> it=list.iterator();
//		while (it.hasNext()){
//			total+=it.next();
//		}


		//What is the adv of generics: type safty at compile time
		//"is compile time safty net"
		//Bug: never mix gen with non gen code
		List<Integer> list=new ArrayList<>();
		list.add(7);
		foo(list);

		
	}

	public static  void foo(List<Integer> list){
//		list.add("foo");
	}










	public static List<Integer> getList(){
		List<Integer> list=new ArrayList<>();
		list.add(66);
		list.add(31);

		return list;
	}


}



