package com.session1.ex;

import com.session1.ex.Employee;

public class Main {
    public static void main(String[] args) {

        Employee e1=new Employee("raj",5000);
        Employee e2=new Employee("raj",5000);

        //static method can be called with the name of the class we dnot object
        System.out.println(Employee.getCounter());

    }
}










