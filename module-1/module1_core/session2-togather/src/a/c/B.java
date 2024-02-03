package a.c;

import a.b.A;

public class B extends A{
    public static void main(String[] args) {

//        A a=new A();
//        System.out.println(a.l);
//        a.publicMethod();
        B b=new B();
        System.out.println(b.l);
        System.out.println(b.k);
        b.protectedMethod();
        b.publicMethod();
    }
}
