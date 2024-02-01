package com.day5.ex5.generics_demo.c;

import com.sun.jdi.FloatType;

interface Flowable{}
interface Drinkable{}
class Petrol implements Flowable {
}

class Water implements Flowable,Drinkable {
}
class Juice implements Flowable,Drinkable {

}
class Cake{}

class Glass <T extends Flowable & Drinkable>{
    T data;

    public T getData() {
        return data;
    }
    public void setData(T data) {
        this.data = data;
    }
}
public class HowGenericsHelpYouDesignBetter {
    public static void main(String[] args) {
//      Glass<Water> g=new Glass<>();
//
//      g.setData(new Water());

       // Glass<Petrol> g=new Glass<>();

      //  g.setData(new Petrol());

    }
}
