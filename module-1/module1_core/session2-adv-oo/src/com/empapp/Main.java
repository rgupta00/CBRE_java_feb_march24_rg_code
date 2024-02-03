package com.empapp;

public class Main {
    public static void main(String[] args) {

        Employee e1=new FullTimeEmp(1,"amit",69000,"abc123");
        Employee e2=new PartTimeEmp(1,"raj",7800,10,20000);

        SalaryProcessor.paymentProcessor(e1);

        FreelanceConsultant freelanceConsultant=new FreelanceConsultant(10,8,"foo bar");
        SalaryProcessor.paymentProcessor(freelanceConsultant);
    }


}
