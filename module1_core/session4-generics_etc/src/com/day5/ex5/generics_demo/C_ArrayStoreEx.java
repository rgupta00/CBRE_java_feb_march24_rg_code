package com.day5.ex5.generics_demo;
import  java.util.*;
class Animal{}
class Dog extends Animal {}
class Cat extends Animal {}

class CostlyDog extends Dog{}
class CostlyCat extends Cat{}

public class C_ArrayStoreEx {
    public static void main(String[] args) {
        //PECS rule: producer extends and consumer super
       // List<Animal> animals=new ArrayList<Dog>();


//        Dog[]animals=new Dog[3];//ArrayStoreException ex handling
//
//        foo(animals);
//
//        for(Dog dog: animals){
//
//        }

       // List<Animal> aList=new ArrayList<Dog>();

        //polym.. is only suppored for array not for generics
        //ArrayStoreException: Array not not for collection

    }

     static void foo(Animal[] animals) {
        animals[0]=new Cat();
    }
}
