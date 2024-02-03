package com.empapp;

public class PartTimeEmp extends Employee{
    private double baseAmount;
    private int noOfDays;
    private int noOfHr;

    public PartTimeEmp(int id, String name, double baseAmount, int noOfDays, int noOfHr) {
        super(id, name);
        this.baseAmount = baseAmount;
        this.noOfDays = noOfDays;
        this.noOfHr = noOfHr;
    }

    @Override
    public double getPayment() {
        return (baseAmount+ noOfDays* noOfHr)*0.8;
    }
}
