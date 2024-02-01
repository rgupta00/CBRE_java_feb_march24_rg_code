package com.session3.a.ann_innerclass;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

/*
 public default void fooDefault(){
        System.out.println("why default method ?");
        foofPrivate();
    }
    public  static void fooStatic(){
        System.out.println("foo static method ");
    }

    //java 9
    private void foofPrivate(){
        System.out.println("private method is only a helper method to the default method");
    }
 */
interface Cal{
    int add(int a, int b);
}
@FunctionalInterface
interface Foof{
    public void foo(String message);

    public boolean equals(Object obj);//Method of Object class are exceptinal case

    public default void fooDefault(){
        System.out.println("foof default");
    }

}

interface MyFoof{
    public Integer getLength(String name);
}


interface MyFoof2{
    public String concat(String fieldName, String lastName);
}
//funcational interface in java 8*
/*
    Predicate, BiPredicate
    Function
    Consumer
    Supplier
 */

interface MyInn{

}
public class DemoOnLambda {
    public static void main(String[] args) {

        //Functional interface in java 8 , stream processing

        Predicate<String> predicateName= name-> name.contains("raj");
        System.out.println(predicateName.test("amit"));

        BiPredicate<Integer, Integer> predicate2= ( n1,  n2) -> n1>n2;








        MyFoof2 myFoof2=(s1, s2)-> s1.concat(s2);

//        MyFoof myFoof= n -> n.length();
//        System.out.println(myFoof.getLength("java champs"));


        //Ann inner class : dont have any name
        //Ann inner class vs lambada==> funcational interface : SAM
        //Type interface
//        Cal cal=(int a, int b)-> {
//                return a+b;
//
//        };

        Cal cal=( a,  b)-> a+b;
        System.out.println(cal.add(2,3));


//        Foof foof=new Foof() {
//            @Override
//            public void foo(String message) {
//                System.out.println(message);
//            }
//        };

        Foof foof= message-> System.out.println(message);
        foof.foo("hello");




    }



}
