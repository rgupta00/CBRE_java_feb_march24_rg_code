package com.session2.demo2.java_interface;
//1. even if no abs method is there.. we can create ab class
// i want to stop someobe to create the object

// abstract class A{ }

abstract class A{
    int i;
    A(int i) {
        this.i = i;
    }
  abstract   public void foo();
    void foof(){

    }
}
class AEx extends A{
    AEx(int i){
        super(i);
    }
    public void foo(){

    }
}
public class E_AllAboutAbsClass {
    public static void main(String[] args) {

    }
}
