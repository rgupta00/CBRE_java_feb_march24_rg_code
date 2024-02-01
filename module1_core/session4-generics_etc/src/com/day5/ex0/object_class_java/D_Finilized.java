package com.day5.ex0.object_class_java;

public class D_Finilized {
    public static void main(String[] args)throws Exception {

        Employee employee1=new Employee(1, "raj", "noida",70000);

        employee1=null;

        System.gc();//req to gc

        Thread.currentThread().sleep(1000);
        //Runtime.getRuntime().gc();

        System.out.println("-------------------------");
    }
}
