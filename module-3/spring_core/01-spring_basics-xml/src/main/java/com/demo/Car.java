package com.demo;
//Car --> MrfTyre
//SOLID
//OCP
//Here car is resp for creating the object of tyre
//Car is pulling the dep of tyre "pull"
//Rather then car is looing for tyre
//tyre is injected to the car
//"push" me only
public class Car {
     private Tyre tyre;

    public Car() {
        System.out.println("ctr of car");
    }

    public void setTyre(Tyre tyre) {
        this.tyre = tyre;
    }
    public void move(){
        tyre.rotate();
        System.out.println("car is moving..");
    }
}
