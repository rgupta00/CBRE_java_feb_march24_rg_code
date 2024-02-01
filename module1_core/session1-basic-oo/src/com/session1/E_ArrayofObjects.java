package com.session1;
class Dog{
    public void sound(){
        System.out.println("dog sound");
    }
}
public class E_ArrayofObjects {
    public static void main(String[] args) {

        //how to create array of object? how it orgainized in memory?
         Dog[]dogs=new Dog[5];
         dogs[0]=new Dog();
        dogs[1]=new Dog();
        dogs[2]=new Dog();
        dogs[3]=new Dog();
        dogs[4]=new Dog();

         for(Dog dog: dogs){
             dog.sound();
         }


    }
}
