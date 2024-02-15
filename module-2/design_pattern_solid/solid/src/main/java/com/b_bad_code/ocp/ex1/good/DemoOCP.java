package com.b_bad_code.ocp.ex1.good;
//Seprate what varies

//O:OCP: Open close pri: open for ext and close for moidification
interface Operation{
	public int apply(int a, int b);
}
 class Calculator{
	//OCP
	public final static int applyOperation(int a, int b,Operation operation ){
		return operation.apply(a, b);
	}
}


public class DemoOCP {

	public static void main(String[] args) {
		Calculator c = new Calculator();

//		Operation addOp=new Operation() {
//			@Override
//			public int apply(int a, int b) {
//				return a+b;
//			}
//		};

		Operation mulOp=new Operation() {
			@Override
			public int apply(int a, int b) {
				return a*b;
			}
		};

		System.out.println(Calculator.applyOperation(3,7, mulOp));

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