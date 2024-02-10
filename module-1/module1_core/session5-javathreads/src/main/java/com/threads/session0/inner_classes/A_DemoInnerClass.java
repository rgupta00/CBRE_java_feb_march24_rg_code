package com.threads.session0.inner_classes;

/*
                nested classes

        inner classes               static nested class
        top level inner class
        method local inner class
        annonymous inner class
 */

//class A{
//    class B{
//
//    }
//}
//class A{
//
//    void foo(){
//        class M{}
//    }
//}

//ann inner class
interface Cookable{
    void cook();
}
public class A_DemoInnerClass {
    public static void main(String[] args) {

//        Cookable cookable=new Cookable() {
//            @Override
//            public void cook() {
//                System.out.println("it is a imp of cook.. ann inner class");
//            }
//        };
//
//        Cookable cookable2=new Cookable() {
//            @Override
//            public void cook() {
//                System.out.println("it is a imp of cook.. ann inner class");
//            }
//        };

        //?
        Cookable cookable=()-> System.out.println("it is a imp of cook.. ann inner class");
        cookable.cook();



        System.out.println("hello");
    }
}
