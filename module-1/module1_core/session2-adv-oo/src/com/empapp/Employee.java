package com.empapp;

abstract public class Employee implements Payable{
    private int id;
    private String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public void print(){
        System.out.println("id : "+ id);
        System.out.println("name: "+ name);
    }
    abstract public double getPayment();
}
