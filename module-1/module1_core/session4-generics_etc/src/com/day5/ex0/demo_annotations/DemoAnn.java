package com.day5.ex0.demo_annotations;
class A{
    void foof(){
        System.out.println("foof of class A");
    }
    @Deprecated
    void foofOldApi(){
        System.out.println("foof of class A old api");
    }
}
class B extends  A{

   @Override
    void foof(){
        System.out.println("foof of class A overriding");
    }
}
public class DemoAnn {
    public static void main(String[] args) {

        A a=new A();
        a.foofOldApi();
    }
}
