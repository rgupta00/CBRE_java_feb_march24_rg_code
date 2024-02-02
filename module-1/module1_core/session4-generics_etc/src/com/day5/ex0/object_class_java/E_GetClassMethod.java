package com.day5.ex0.object_class_java;

public class E_GetClassMethod {
    public static void main(String[] args) {

        Employee employee1=new Employee(1, "raj", "noida",70000);
        Employee employee2=new Employee(1, "raj", "noida",70000);

        Class<?> clazzClass=employee1.getClass();
        Class<?> clazzClass2=employee2.getClass();

        //this cookie cutter can give me valuable info about the class at run time
        //get this info : java reflection is used in all java framework ....*
        System.out.println(clazzClass);
        System.out.println(clazzClass2);



    }
}
