package com.day5.ex8.a.generics_example;
import java.util.*;
class Animal{
    void sound(){
        System.out.println("dont know");
    }
}
class Cat extends Animal{
    void sound(){
        System.out.println("meou");
    }
}
class Dog extends Animal{
    void sound(){
        System.out.println("bho bho");
    }
}
class CostlyCat extends Cat{
    void sound(){
        System.out.println("bho bho CostlyCat");
    }
}
class CostlyDog extends Dog{
    void sound(){
        System.out.println("bho bho costly dog");
    }
}

public class C_SuperVsExtends {
    public static void main(String[] args) {

        //data add karna allowed he
//        List<? super Dog> list=new ArrayList<Animal>();
//        list.add(new Dog());
//        list.add(new Cat());


      //  Animal[]animals=new Dog[5];

        //both are same
//        List<? extends Object> list=new ArrayList<Animal>();
//        List<?> list=new ArrayList<Animal>();


//        List<? extends Dog> list=new ArrayList<Dog>();
//
//        Animal animal=null;

      //  list.add(null);//?





        //? extends Animal : define upper bound
        //List<? extends Animal> animals=new ArrayList<Dog>();
       // List<? extends Dog> animals2=new ArrayList<Dog>();
        //List<? extends CostlyDog> animals3=new ArrayList<Dog>();

        //? super Animal : define lower bound
        //super se upper
        List<? super Dog> animals=new ArrayList<Dog>();
        animals.add(new Dog());
        animals.add(new CostlyDog());


    }
}
