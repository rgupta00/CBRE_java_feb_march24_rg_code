package demo.java8.session1.ex1;
/*
    java 7 vs java 8 interface
    * default method inside interface
    * static method inside interface
    * diamond problem in java 8 due to interface
    * functional interface, examples
 */
//java 7: 100% abs

//after java 8: i can say interface is not 100% abs
//java 8: u can define default methods , static method
//java 9: even u can have private method inside the interface

//interface Foof{
//    void foo();
//    default void foof(){
//        System.out.println("foof default method");
//        foofPrivate();
//    }
//    static void foofStatic(){
//        System.out.println("foof static method");
//    }
//    private void foofPrivate(){
//        System.out.println("this is private helper method to the default method");
//    }
//}
//class MyFoofImpl implements Foof{
//    public void foo(){
//        System.out.println("override foof");
//    }
//
//}

//stream procssing --> lambada exp--> funcational interface
//cbre "raj": PM    amit / sumit
//
//interface StackApi{
//    void push();
//    void pop();
//    default void peek(){
//        System.out.println("default method give by raj");
//    }
//}
////amit
//class StackApiImpl1 implements StackApi{
//    @Override
//    public void push() {
//        System.out.println("push by amit");
//    }
//
//    @Override
//    public void pop() {
//        System.out.println("pop by amit");
//    }
//    public   void peek(){
//        System.out.println("default method given by raj overriden by amit");
//    }
//}
////sumit
//class StackApiImpl2 implements StackApi{
//
//    @Override
//    public void push() {
//        System.out.println("push by sumit");
//    }
//
//    @Override
//    public void pop() {
//        System.out.println("pop by sumit");
//    }
//}

//interface can have diamond problem since java 8

//interface A1{
//    default void foof(){
//        System.out.println("foof of A1");
//    }
//}
//interface B1{
//    default void foof(){
//        System.out.println("foof of B1");
//    }
//}
//class M implements A1,B1{
//    public void foof(){
//        A1.super.foof();
//        B1.super.foof();
//        System.out.println("foof method is overriden");
//    }
//}

public class B_InterfaceChangesInJava8 {
    public static void main(String[] args) {
//        StackApi s=new StackApiImpl2();
//        s.peek();
//        Foof foof=new MyFoofImpl();
//        Foof.foofStatic();
//        foof.foof();
    }
}








