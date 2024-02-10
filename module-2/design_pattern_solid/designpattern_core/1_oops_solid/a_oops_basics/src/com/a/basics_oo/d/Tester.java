package com.a.basics_oo.d;

public class Tester {

	public static void main(String[] args) {
		
		Employee employee=new FullTimeEmployee(2, "raj", 700000);
		
		EmployeePaymentProceseingSystem employeePaymentProceseingSystem=
				new EmployeePaymentProceseingSystem();
		
		employeePaymentProceseingSystem.paymentProceseingSystem(employee);
		
		Invoice invoice=new Invoice("raj", 4900, 10);
		
		employeePaymentProceseingSystem.paymentProceseingSystem(invoice);

		
	}

}
