package com.session2.demo2.java_interface;

//final class A1{
//    final void foo(){
//        System.out.println("foo method is final");
//    }
//     void foo2(){
//        System.out.println("foo method is final");
//    }
//}
//class B1 extends A1{
//    void foo2(){
//
//    }
//     void foo(){
//        System.out.println("foo method is final");
//    }
//}

//class Foo extends String{
//
//}

class Emp{
    private int id;
    private double salary;

    public Emp(int id, double salary) {
        this.id = id;
        this.salary = salary;
    }
    public int getId() {
        return id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
public class D_DemoFinal {
    public static void increment(final Emp emp){
        emp.setSalary(emp.getSalary()+2000);
    }
    public static void main(String[] args) {
        final int i=6; //primitive
         final Emp e=new Emp(1,6000);//object
        //e is just like final pointer

        increment(e);


        //final ie can not change
        //final variable
        //final method
        //final method arg
        //final class

    }
}
