package com.b_bad_code.ocp.ex1;
//Seprate what varies

//O:OCP: 
 class Calculator{
	int add ( int a , int b) {
		return a+b;
	}
	int multiply ( int a , int b) {
		return a*b;
	}

	int div ( int a , int b) {
		return a/b;
	}
}


public class DemoOCP {

	public static void main(String[] args) {
		Calculator c = new Calculator();


	}
}



//interface Process {
//	int apply(int a, int b);
//}
//
//class Calculator {
//	public int processData(int a, int b, Process process) {
//		return process.apply(a, b);
//	}
//}

// int result = c.processData(1, 2, (a, b) -> a + b);
//
//		System.out.println(result);
//
// int result2 = c.processData(1, 2, (int a, int b) -> a * b);
//
//		System.out.println(result2);