package com.demo.annotations;

import java.util.ArrayList;
import java.util.List;

/*
        what is Annation"?: aka meta data
        type of annotations:
            jdk annotations
            user define anntations
            Predefined annotations

        @Deprecated
        @Override
        @SuppressWarnings
        @FunctionalInterface
 */
@FunctionalInterface
interface Foo{

   default void foo2(){
   }
   void foo();
}
class A{

    void foo(){
        System.out.println("foo A");
    }
    @Deprecated
    @SuppressWarnings({"rawtypes","unchecked"})
    public void oldApi(){
        List list=new ArrayList();
        list.add("foo");
        System.out.println("something old api :(");
    }
}

class B extends A{
    @Override
    void foo(){
        System.out.println("foo B");
    }
}
public class DemoAnnotation {
    public static void main(String[] args) {

        A a=new B();
        a.foo();
        a.oldApi();//indicate dont use this
    }
}
