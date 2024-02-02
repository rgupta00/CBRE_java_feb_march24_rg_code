package com.a.c;

import com.a.b.*;

public class Foo extends A{
    public static void main(String[] args) {
        Foo a=new Foo();
        System.out.println(a.l);
        a.publicMethod();
        System.out.println();
        //
      //  a.protectedMethod();
        //a.defaultMethod();

    }
}
