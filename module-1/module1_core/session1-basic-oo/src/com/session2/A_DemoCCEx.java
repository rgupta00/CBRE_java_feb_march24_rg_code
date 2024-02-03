package com.session2;
class Animal{
    void sound(){
        System.out.println("sound of animal");
    }
}
class Dog extends Animal{
    void nightWatchmanShip(){
        System.out.println("jagata haho");
    }
    void sound(){
        System.out.println("bho bho");
    }
}

class Cat extends  Animal{
    void sound(){
        System.out.println("meou");
    }
}

public class A_DemoCCEx {
    public static void main(String[] args) {

        Animal[]animals={new Dog(), new Cat(), new Dog(), new Cat()};

        for(Animal animal: animals){
           Animal a=animal;
           a.sound();
           if(a instanceof Dog)
            ((Dog)a).nightWatchmanShip();
        }
    }
}
