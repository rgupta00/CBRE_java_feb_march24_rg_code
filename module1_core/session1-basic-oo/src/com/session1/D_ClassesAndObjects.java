package com.session1;
//Creating class, object how it organized in memory?
//Ctr
// data inside the class: instance variable, static and local variable
//method : instance vs static methods
//What is init block? static init block
//visiblity modifier
//data (instance / local /static ) + methods

 class Emp {
        private int id;
        private  String name;
        private double salary;
        private static int counter=0;//class variable

     //static methods: object is not req
     //in static method "this" is not avaible
     public static int getCounter(){
         return counter;
     }
     //init block
     {
         System.out.println("1st init block");
     }
     {
         System.out.println("2nd init block");
     }

     static {
         counter=6+4;
         System.out.println("static init block");
     }
     public void print(){
         System.out.println("id "+ id+" name: "+ name+" salary: "+ salary);//? perforamance issues
     }
     //default ctr
     public Emp(){
     }
     //para ctr
     public Emp( String name, double salary){
         this.id=++counter;
         this.name=name;
         this.salary=salary;
     }
     public Emp(Emp e){
         this.id=e.id;
         this.name=e.name;
         this.salary=salary;
     }

     public int getId() {
         return id;
     }


     public String getName() {
         return name;
     }


     public double getSalary() {
         return salary;
     }

     public void setSalary(double salary) {
         //validation
         this.salary = salary;
     }



     public static void setCounter(int counter) {
         Emp.counter = counter;
     }
 }
public class D_ClassesAndObjects {
    public static void main(String[] args) {
        Emp emp=new Emp("raja",7000);
        emp.print();

        Emp emp2=new Emp("amit",8000);
        emp2.print();

        System.out.println(Emp.getCounter());


    }
}








