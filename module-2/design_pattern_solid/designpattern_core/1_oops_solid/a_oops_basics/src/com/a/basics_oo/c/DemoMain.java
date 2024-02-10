package com.a.basics_oo.c;

public class DemoMain {

	public static void main(String[] args) {
		
		AmitStack stack=new AmitStack();
		
		someInternalLogic(stack);
	}
	
	public static void someInternalLogic(AmitStack stack) {
		
		stack.amitPush(44);
		stack.amitPush(404);
	
		
		System.out.println(stack.raviPop());
		System.out.println(stack.raviPop());

		
		
	}

}
