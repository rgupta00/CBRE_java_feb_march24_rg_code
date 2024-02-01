package com.session1.ex;

public class SingletonDemo {
    public static void main(String[] args) {
        Singleton singleton=Singleton.getSingleton();
        Singleton singleton2=Singleton.getSingleton();
        System.out.println(singleton.hashCode());//what hashcode?
        System.out.println(singleton2.hashCode());

    }
}
