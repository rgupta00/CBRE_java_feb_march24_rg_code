package com.session4.ex0.object_class_java;

public class C_CloneMethod {
	public static void main(String[] args) throws CloneNotSupportedException {
		Employee employee=new Employee(1, "raj", "noida",70000);

		Employee employeeClonned= (Employee) employee.clone();

		if(employee.equals(employeeClonned)){
			System.out.println("true");
		}else{
			System.out.println("false");
		}
	}

}
