package com.session1.doubts;
class A{
     void foo(){
        System.out.println("I");
    }
}


class B extends A{

     void foo(){
        System.out.println(" II");
    }
}
public class StaticMetodDontSupportOverrding {
    public static void main(String[] args) {
        A a=new B();
        a.foo();
    }
}
