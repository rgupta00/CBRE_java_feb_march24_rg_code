package com.session2.demo1.c.relationship_bw_objects.inh;

public class PartTimeEmployee extends Employee{
    private int noOfDays;
    private int perDaySalary;

    public PartTimeEmployee(int id, String name, double salary, int noOfDays, int perDaySalary) {
        super(id, name, salary);
        this.noOfDays = noOfDays;
        this.perDaySalary = perDaySalary;
    }
    public void printEmployeeDetails(){
        super.printEmployeeDetails();
        System.out.println("noOfDays :"+ noOfDays);
        System.out.println("perDaySalary :"+ perDaySalary);
    }
}
