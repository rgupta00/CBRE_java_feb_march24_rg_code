package com.empapp;

public class FullTimeEmp extends Employee{
    private double salary;
    private String ppf;

    public FullTimeEmp(int id, String name, double salary, String ppf) {
        super(id, name);
        this.salary = salary;
        this.ppf = ppf;
    }

    @Override
    public double getPayment() {
        salary=salary*0.7;//Logic
        return salary;
    }
}
