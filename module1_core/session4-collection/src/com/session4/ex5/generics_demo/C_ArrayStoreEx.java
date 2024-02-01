package com.session4.ex5.generics_demo;

import java.util.ArrayList;
import java.util.List;

class Animal{}
class Dog extends Animal{}
class Cat extends Animal{}

class CostlyDog extends Dog{}
class CostlyCat extends Cat{}

public class C_ArrayStoreEx {
    public static void main(String[] args) {
        Animal[]animals=new Dog[3];//ArrayStoreException ex handling
        
       // List<Animal> aList=new ArrayList<Dog>();

        //polym.. is only suppored for array not for generics
        //ArrayStoreException: Array not not for collection

    }
}
