package com.day5.ex0.doubts;
import java.io.StringWriter;
import java.util.*;
public class Demo {
    public static void main(String[] args) {

        Employee e1=new Employee(1,"rajat","delhi",5000);
        Employee e2=new Employee(2,"ekta","delhi",5000);
        Employee e3=new Employee(3,"amit","noida",6000);

        List<Employee> employees=new ArrayList<>();
        employees.add(e1);
        employees.add(e2);
        employees.add(e3);

        Collections.sort(employees, new CitySorter());


        //Wrapper classes it is a wrapper over primitive data
        //Number=> Integer , Double....
        //int i=4;
//        Integer it=new Integer(i);
        //java 4
//        int temp=it.intValue();
//        temp++;
//        it=new Integer(temp);

        //java 5 : auto boxing unboxing
//        Integer it2=5;//auto boxing
//        int temp2=it2;//auto unboxing
//        it2++;
//
//      Integer a=4;
//      Integer b=40;
//
//      int result= a.compareTo(b);
//        System.out.println(result);

//        String data1="foo";
//        String data2="foo";
//        int result2=data1.compareTo(data2);



        //generics is not run time behavioural

        //compile time safty net
//        List<Integer> list=new ArrayList<>();
//        list.add(3);
        //java 1.4: lagacy version

        //java 5 modern java
        //autoboxing and unboxing : syntex suger

        //java 8

        //java 9

        //java 11

        //java 21
       // list.add(3);//collection ke ander primitive naha aagaya


    }
}
