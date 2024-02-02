package com.day5.ex5.reflection_demo;
//spring hib

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class A_DemoRef {
    public static void main(String[] args)throws Exception {
        //How to get meta data inforamtion of the class at run
        //static loading


      //Employee e=new Employee();

        //dynamic class loding

        Class<?> clazz=
                Class.forName("com.day5.ex5.reflection_demo.Employee");
        //let me get inforation of all methods of this class

        Method[]methods=clazz.getDeclaredMethods();
        for(Method m: methods){
            System.out.println(m.getName()+"    : "+ Modifier.toString(m.getModifiers())+": "+ m.getReturnType());
        }

        //Annotation

    }
}
