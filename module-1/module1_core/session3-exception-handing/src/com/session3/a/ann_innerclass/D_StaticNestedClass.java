package com.session3.a.ann_innerclass;

class Foo1{
    private static  int i=44;
    private int j=55;
    public void foof2(){
        System.out.println("foof instance method");
    }
    public static void foofStatic(){
        System.out.println("foof static instance method");
    }
    static  class Bar1{
        public void foof(){
            System.out.println(i);
            foofStatic();
        }

    }
}
public class D_StaticNestedClass {
    public static void main(String[] args) {

        Foo1 f=new Foo1();
        Foo1.Bar1 bar1=new Foo1.Bar1();

    }
}
