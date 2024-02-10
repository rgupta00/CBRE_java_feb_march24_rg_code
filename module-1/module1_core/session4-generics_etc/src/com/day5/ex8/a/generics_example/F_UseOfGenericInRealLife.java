package com.day5.ex8.a.generics_example;
//? super to enfore BL
interface Flowable{}
interface Drinkable{}
class Petrol implements Flowable{}
class Juice implements Flowable, Drinkable{}
class Wine implements Flowable, Drinkable{}
class Cake{}

class Glass<T extends Flowable & Drinkable>{
   private T object;

    public T getObject() {
        return object;
    }

    public void setObject(T object) {
        this.object = object;
    }
}
public class F_UseOfGenericInRealLife {
    public static void main(String[] args) {

        Glass<Juice> glass=new Glass<>();
        glass.setObject(new Juice());



    }
}
