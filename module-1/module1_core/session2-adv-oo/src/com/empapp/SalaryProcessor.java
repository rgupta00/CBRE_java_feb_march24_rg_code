package com.empapp;

public class SalaryProcessor {
    public static void paymentProcessor(Payable payable){
        double payment = payable.getPayment();
        //store payment in db
        System.out.println("payment : "+ payment);
    }
}
