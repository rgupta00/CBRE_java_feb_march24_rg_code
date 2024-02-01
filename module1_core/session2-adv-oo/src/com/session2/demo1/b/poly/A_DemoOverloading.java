package com.session2.demo1.b.poly;

class Cal{
    //same class me ho sakta hey
    public double add(double a, int b){
        System.out.println(" public double add(double a, int b)");
        return a+b;
    }

    public double add(int a, double b){
        System.out.println("public double add(int a, double b)");
        return a+b;
    }
}

class Foo{

    void foof(Object a){
        System.out.println(" void foof(Object a)");
    }

    void foof(Integer a){
        System.out.println(" void foof(Integer a)");
    }
}

public class A_DemoOverloading {
    public static void main(String[] args) {
        Foo f=new Foo();
        f.foof(null);

//        Cal cal=new Cal();
//        double sum=cal.add(3,5.6);
//        System.out.println(sum);
    }
}













