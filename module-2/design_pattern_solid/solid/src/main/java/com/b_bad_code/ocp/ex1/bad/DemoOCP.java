package com.b_bad_code.ocp.ex1.bad;
//Seprate what varies

//O:OCP: Open close pri: open for ext and close for moidification
 class Calculator{
	int add ( int a , int b) {
		return a+b;
	}
	int mul ( int a , int b) {
		return a*b;
	}
}


public class DemoOCP {

	public static void main(String[] args) {
		Calculator c = new Calculator();

		System.out.println(c.add(3,5));
		System.out.println(c.mul(3,6));

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