package com.dp.creational.a.singleton;

import java.lang.reflect.Constructor;

public class DemoSingleton {
    public static void main(String[] args)throws Exception {

        //log4j

        Singleton singleton=Singleton.getSingleton();
        Singleton singleton2=Singleton.getSingleton();
//
        System.out.println(singleton2.hashCode());
        System.out.println(singleton.hashCode());

        //singleton can be broken using java refl
        Class<?> claxx=Class.forName("com.dp.creational.a.singleton.Singleton");
        Constructor[]constructors=claxx.getDeclaredConstructors();
        constructors[0].setAccessible(true);

        Singleton singleton3=(Singleton) constructors[0].newInstance();
        System.out.println(singleton3.hashCode());

    }
}
