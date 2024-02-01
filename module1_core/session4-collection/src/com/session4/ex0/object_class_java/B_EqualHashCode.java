package com.session4.ex0.object_class_java;

public class B_EqualHashCode {

	public static void main(String[] args) {
		Employee employee1=new Employee(1, "raj", "noida",70000);
		Employee employee2=new Employee(1, "raj", "noida",70000);
		
//		//if both are same of not
		//compare the addresses

//		if(employee1==employee2){
//			System.out.println("are same address");
//		}else{
//			System.out.println("are not same");
//		}
		
		//if both are same of not
		//compare the addresses
		if(employee1.equals(employee2)){
			System.out.println("are same");
		}else{
			System.out.println("are not same");
		}
	}
}
