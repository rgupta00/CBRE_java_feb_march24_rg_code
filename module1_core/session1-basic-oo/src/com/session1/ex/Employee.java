package com.session1.ex;
//POJO
public class Employee {
    private int id;//instance varaible
    private  String name;//instance varaible
    private   double salary;//instance varaible

    private static int counter=0;

    //static vs normal (intstance method)
    //to call the static method u dont need the object of Employee class
    //static method dont have this ref (pointer)

    public static int getCounter(){
        return counter;
    }
    //ctr:
    public Employee(){
        this("foo",1000);
    }
    //para
    public Employee( String name, double salary) {
        //this();
        this.id = ++counter;
        this.name = name;
        this.salary = salary;
    }
    //Copy ctr C++ and in java
    public Employee(Employee employe) {
        this.id = employe.id;
        this.name = employe.name;
        this.salary = employe.salary;
    }

    public void printEmployee(){
        System.out.println("id :"+ id +" name : "+ name+" salary: "+ salary);
    }


     //i want to force user to call this method...
     public double getTotalSalary(){
          return  0.8*salary;
     }
}
