package com.day5.ex0.tricky_java_questions;
class B{
    void foo(){
        System.out.println("foo of class B");
    }
}
class C{
    void foo(){
        System.out.println("foo of class C");
    }
}
class A{
    private B b=new B();

    void bar(){
        b.foo();
        C c=new C();
    }
    void jar(){
        b.foo();
    }

    public static void main(String[] args) {

    }
}
public class A_compostion {
    public static void main(String[] args) {
        A a=new A();

    }
}
