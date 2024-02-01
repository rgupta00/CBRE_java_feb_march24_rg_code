package com.session4.ex5.generics_demo;

public class A_NeedOfGenerics {
	
	public static void main(String[] args) {
		//java 5
		int sum=0;
		List list=getList();

		for(Object temp:list){
			if(temp instanceof Integer) {
				sum += (Integer) temp;
			}
		}
		System.out.println(sum);


	}

	public static List getList(){
		List list=new ArrayList();
		list.add(33);
		list.add(33);
		list.add("foo");

		return  list;
	}

}
