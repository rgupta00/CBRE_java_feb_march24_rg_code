package com.day5.ex5.reflection_demo;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

class Singleton{
    private Singleton(){
        System.out.println("dare to call");
    }
}




class CallDemo{
    private String welcome(String name){
        return "welcome "+ name;
    }
}

public class B_CallingPrivateCtr {

    public static void main(String[] args)throws Exception {

        Class<?> clazz=
                Class.forName("com.day5.ex5.reflection_demo.CallDemo");

                                        //name of method        return type ...
        Method method=clazz.getDeclaredMethod("welcome",String.class);
        method.setAccessible(true);

        CallDemo callDemo = (CallDemo) clazz.newInstance();
        //I want to call that method

      String result= (String) method.invoke(callDemo,"champs " );
        System.out.println(result);














//        Class<?> clazz=
//                Class.forName("com.day5.ex5.reflection_demo.Singleton");
//
//        Constructor[]constructors=clazz.getDeclaredConstructors();
//        constructors[0].setAccessible(true);//even if it is privaete i want to call it
//        //ref can break encapuslation :(
//
//        Singleton singleton= (Singleton) constructors[0].newInstance();



    }
}
