package com.session2.final_ex;
final class A{
   final void foo(){
       System.out.println("it is a final method");
   }
}
public class DemoFinal {
    public static void main(String[] args) {
        A a=new A();
        a.foo();
    }
}
