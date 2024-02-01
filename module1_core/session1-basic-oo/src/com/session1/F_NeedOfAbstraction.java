package com.session1;

import java.util.Scanner;

/*
Method abstraction?
abstraction help u to achive loose coupling
amit is going from LN to Noida using metro

/*
        Passenger -----> Metro

                                ------ Metro
        Passenger -----> Vehical ----- Car
                                -------Bike
 */
//abstraction: abs class vs interface
interface Vehicle{
    public void move(String s, String d);
}
class Metro implements Vehicle{
    public void move(String s, String d){
        System.out.println("moving from "+ s+ " to "+ d+" using metro");
    }
}
class Car implements Vehicle{
    public void move(String s, String d){
        System.out.println("moving from "+ s+ " to "+ d+" using car");
    }
}
class Passanger {

    private String name;

    public Passanger(String name) {
        this.name = name;
    }

    public void travel(String s, String d, Vehicle vehicle){
        System.out.println("name of passange is: "+ name);
        vehicle.move(s, d);
    }
}
public class F_NeedOfAbstraction {

    public static void main(String[] args) {

        //Change is the only constant in life or in programming!

        Vehicle vehicle=new Car();

        Passanger passanger=new Passanger("amit");
        passanger.travel("Laxmi nagar","MG road", vehicle);

    }
}


















