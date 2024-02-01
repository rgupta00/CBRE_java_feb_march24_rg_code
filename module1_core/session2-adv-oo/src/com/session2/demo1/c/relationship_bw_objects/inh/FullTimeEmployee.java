package com.session2.demo1.c.relationship_bw_objects.inh;

public class FullTimeEmployee extends Employee{
    private String ppf;
    private int shareValue;

    public FullTimeEmployee(int id, String name, double salary,String ppf, int shareValue) {
        super(id, name, salary);
        this.ppf = ppf;
        this.shareValue=shareValue;
    }

    public void printEmployeeDetails(){
        super.printEmployeeDetails();
        System.out.println("ppf :"+ ppf);
        System.out.println("shareValue :"+ shareValue);
    }
}
