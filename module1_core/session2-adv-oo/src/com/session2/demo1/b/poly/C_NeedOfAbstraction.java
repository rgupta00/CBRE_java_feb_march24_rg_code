package com.session2.demo1.b.poly;

import java.util.Scanner;
//100% promise
interface Vehicle{
    public abstract  void move(String s, String d);
}

class Metro implements Vehicle{
    @Override
    public void move(String s, String d){
        System.out.println("passnager is moving from "+ s +" to "+ d +" using metro");
    }
}
class Car  implements Vehicle{
    @Override
    public void move(String s, String d){
        System.out.println("passnager is moving from "+ s +" to "+ d +" using car");
    }
}
class Bike  implements Vehicle{
    @Override
    public void move(String s, String d){
        System.out.println("passnager is moving from "+ s +" to "+ d +" using bike");
    }
}

//u need to define a contract bw Passanger and Car /Bike/Metro
//Passanger ---> Vehicle : Car /Bike/Metro
//abstraction : 2 ways : interface vs Abstract class
//relationship bw the object: IS A , HAS A, USE A


class Passanger{
    private String name;

    public Passanger(String name) {
        this.name = name;
    }

    public void travel(String s, String d,Vehicle v){
        System.out.println("name of passanger is "+ name);
         v.move(s, d);
    }
}
public class C_NeedOfAbstraction {

    public static void main(String[] args) {

        //Change is the only constant in life or in programming!
        System.out.println("PE choice of vehicle 1. Metro 2.Car 3.Bike");
        Scanner sc = new Scanner(System.in);

        int choice= sc.nextInt();

        Vehicle v = null;
        if(choice==1)
            v=new Metro();
        else if(choice==2)
            v=new Car();
        else
            v=new Bike();

        Passanger passanger=new Passanger("amit");
        passanger.travel("LN","Noida", v);

    }
}


















