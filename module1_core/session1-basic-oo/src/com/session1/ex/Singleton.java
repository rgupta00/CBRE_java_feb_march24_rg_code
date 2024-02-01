package com.session1.ex;

public class Singleton {
    private static Singleton singleton=new Singleton();

    //private
    private Singleton(){
        System.out.println("dare to call me");
    }

    //expose to outside word
    public static Singleton getSingleton(){
        return singleton;
    }
}
