package com.session2.demo_objectclass;

public class DemoObClass {
    public static void main(String[] args) {

        //Object class
        //toString
        //equals
        Employee employee1=new Employee(1,"raj",70000);
        Employee employee2=new Employee(1,"raj",70000);

        System.out.println(employee1.getClass());

        //aka comparsion of ref ie address
        if(employee1==employee2){

        }

        //contents
        if(employee1.equals(employee2)){
            System.out.println("are eq");
        }
        else
            System.out.println("not eq");


    }
}
