package com.session3.b.ex_handling;

class AEx extends Exception{}
class BEx extends Exception{}
class B1Ex extends BEx{}

//class Foo{
//    //void foof2(int i){}
//
//    void foof()throws IOException {
//        System.out.println("foof of Foo class");
//    }
//}
///*
//1. badi ex can not be thrown for overriden method
//2. not throwing ex is ok
//3. u can throw extra unchecked ex
// */
//class Bar extends Foo{
//   // void foof2(int i, int j)throws AEx{}
//    @Override
//    void foof()throws NullPointerException{
//        System.out.println("foof of Foo class");
//    }
//}


//class Foo{
//    Foo()throws IOException{
//       System.out.println("ctr of Foo");
//   }
//}
//
//class Bar extends Foo{
//    Bar()throws Exception{
//        super();
//        System.out.println("ctr of Bar");
//    }
//}

public class E_ExHandingAndOverriding {
    public static void main(String[] args) {

    }
}
