package com.day5.ex0.object_class_java;

public class DemoHello {
    public static void main(String[] args) throws CloneNotSupportedException {
       Employee e1=new Employee(1,"raja","delhi",4000);
        Employee e2=new Employee(1,"raja","delhi",4000);

        //both are same but bad
//        System.gc();//req it is a bad
//        Runtime.getRuntime().gc();

        e1=null;

       // Employee e3= (Employee) e1.clone();

        //java reflection*
//        System.out.println(e1.getClass());
//        System.out.println(e2.getClass());


//        if(e1.equals(e3))
//            System.out.println("are eq");
//        else
//            System.out.println("not eq");

    }
}
