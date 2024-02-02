package com.day5.ex5.generics_demo.a;
import java.util.*;
class Animal{}
class Cat extends Animal{}
class CostlyCat extends Cat{}
class Dog extends Animal {}
class CostlyDog extends  Dog{}

public class D_SuperVsExtends {
    public static void main(String[] args) {

        Cat c=new Cat();

        //super is lower bound : dog or above
      //  List<? super Dog> list=new ArrayList<Dog>();      //Y
        //List<? super Dog> list=new ArrayList<Animal>();   //Y
//      List<? super Dog> list=new ArrayList<Object>();     //Y
 //       List<? super Dog> list=new ArrayList<CostlyDog>(); //N

        //PECS
//        List<Dog> list=new ArrayList<Dog>();

      //  List<Dog> list=new ArrayList<>();
//        list.add(new CostlyDog());
//        list.add(new Dog());
    //    foo(list);
    }
    public static void foo(List<? super Animal>  list){
        list.add(new Cat());
    }
}


















//List<? extends Animal> list2=new ArrayList<Dog>();

//  list2.add(null);

// list2.remove(c);

//allowed syntex extends
//        List<? extends Animal> list=new ArrayList<CostlyDog>();
//        for(Animal a: list){
//            System.out.println(a);
//        }
//        List<? extends Animal> list2=new ArrayList<CostlyCat>();
//
//        List<? extends Animal> list3=new ArrayList<Cat>();
//
//        List<? extends Animal> list4=new ArrayList<Animal>();
//
//        List<?> list5=new ArrayList<Object>();

//allowed syntex super



