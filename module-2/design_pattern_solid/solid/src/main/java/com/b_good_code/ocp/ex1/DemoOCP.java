package com.b_good_code.ocp.ex1;
//Seprate what varies

//O:OCP:
interface Operation{
	int apply(int a, int b);
}
class Calculator{
	static int applyOperation ( int a , int b, Operation operation) {
		return operation.apply(a, b);
	}
}
public class DemoOCP {
	public static void main(String[] args) {
		Operation add=(a,b)-> a+b;

		System.out.println(Calculator.applyOperation(2,5,add));

		Operation div=(a,b)-> a/b;
		System.out.println(Calculator.applyOperation(20,5,div));

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