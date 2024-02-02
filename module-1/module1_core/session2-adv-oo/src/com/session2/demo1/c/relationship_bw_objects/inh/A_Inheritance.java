package com.session2.demo1.c.relationship_bw_objects.inh;
/*
        What is inheritance , type of inheritance how
 */
public class A_Inheritance {
    public static void main(String[] args) {

        //int id, String name, double salary,String ppf, int shareValue
         Employee e=new FullTimeEmployee(3,"raja",560000, "ftdgd",69000);

       //(int id, String name, double salary, int noOfDays, int perDaySalary
        Employee e2=new PartTimeEmployee(3,"raja",560000, 15,25000);



    }
}
