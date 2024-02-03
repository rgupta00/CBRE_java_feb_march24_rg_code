package com.empapp;

public class FreelanceConsultant implements Payable{
    private int noOfDays;
    private int noOfHr;
    private String companyName;

    public FreelanceConsultant(int noOfDays, int noOfHr, String companyName) {
        this.noOfDays = noOfDays;
        this.noOfHr = noOfHr;
        this.companyName = companyName;
    }

    @Override
    public double getPayment() {
        return noOfDays*noOfHr*0.8;
    }
}
