package com.day5.ex0.java_reflection;

import com.day5.ex0.object_class_java.Employee;

import java.lang.annotation.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

//how to write custom annotation and process it using java reflection

/**
 * it is a custom annotation
 * @Author
 */
//annotation processing
    //1. u create a annotation
@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
//@Documented
//@Inherited
@interface MyAnno{
    public String foo() default "it is foo method";
    public boolean isDone() default false;
}

//u applied the ann
class Student{
    int i;
    String  name;

    private Student() {
        System.out.println("dare to call it");
    }

    //annotation lagaga
    @MyAnno(foo = "it is great topic in java", isDone =false)
    public void fooAnnotationMethod(){
        System.out.println("it is demo of ann application");
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
public class WhatIsJavaRef {
    public static void main(String[] args) throws ClassNotFoundException, InvocationTargetException,
            InstantiationException, IllegalAccessException {
        //if i want to know what is the meta data of a class at run time
        //we use a api ie java reflection

        //class ki static loading
//       Student s=new Student();
        //dynamic class loading, all framework interanlly use it

//        Class<?> clazz=Student.class.getClass();
        Class<?> clazz=Class.forName("com.day5.ex0.java_reflection.Student");
       // Class<?> clazz=

//        Method[]methods=clazz.getMethods();
//
//        for(Method method: methods){
//            System.out.println(method.getName()+": "+ Modifier.toString(method.getModifiers()));
//        }

        //java reflection can break encapsulation

//        Constructor[]constructors=clazz.getDeclaredConstructors();
//        constructors[0].setAccessible(true);
//
//        Student o = (Student) constructors[0].newInstance();

        //3 using java reflection process kiya


        Method[]methods=clazz.getMethods();

        for(Method method: methods){
           if(method.isAnnotationPresent(MyAnno.class)){
               MyAnno myAnno=method.getAnnotation(MyAnno.class);
               System.out.println(method.getName()+" : "+ myAnno.isDone()+" : "+ myAnno.foo());

           }
        }
    }
}
