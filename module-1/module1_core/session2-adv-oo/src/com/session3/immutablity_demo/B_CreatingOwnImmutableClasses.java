package com.session3.immutablity_demo;

import java.util.Arrays;
import java.util.Date;
//Marker Cloneable is empty!
class Foo implements Cloneable{
    private int i;
    public int getI() {
        return i;
    }
    public void setI(int i) {
        this.i = i;
    }
    @Override
    protected Object clone() {
       try{
           return super.clone();
       }catch (Exception e){

       }
       return null;
    }
}
//Need of immutable class vs object?
final class MyImmutableClass {
    private final int i;
    private final int arr[];
    private final Date date;
    private Foo foo;

    public MyImmutableClass(int i, int[] arr, Date date, Foo foo) {
        this.i = i;
        this.arr = Arrays.copyOf(arr, arr.length);
        this.date =(Date) date.clone();
        this.foo = (Foo) foo.clone();
    }

    public int[] getArr() {
        return arr;
    }

    public int getI() {
        return i;
    }
    public Date getDate() {
        return (Date) date.clone();
    }
    public Foo getFoo() {
        return (Foo) foo.clone();
    }
    public void print(){
        System.out.println("i :"+ i);
        for(int a: arr){
            System.out.println(" value :"+ a);
        }
        System.out.println(date);
        System.out.println(foo.getI());
    }
}
public class B_CreatingOwnImmutableClasses {
    public static void main(String[] args) {
        int arr[]={5,6,77};
        Date date=new Date();
        Foo foo=new Foo();
        foo.setI(55);

        MyImmutableClass myImmutableClass=
                new MyImmutableClass(22,arr, date, foo);

        myImmutableClass.print();
        arr[1]=500;

        int arr2[]=myImmutableClass.getArr();

        arr2[1]=333333;
        myImmutableClass.print();

        //Need of immutable classes? are thread safe

        //how to create immutable classes?
    }
}
