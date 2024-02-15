package com.dp.creational.a.singleton;

import java.io.Serializable;

/*
 	" one object per application" ex logging , db connection etc

	=> lazy vs eager
	=> threading issue, double locking
	=> What if clonned
	=> What if deserilized?
	=> What if used java reflection?
	=> what if 2 class loader load that class twice
	=> best practices, effective java
	=> using enum


	private Object readResolve() {
		System.out.println("--------readResolve------------");
		return singleton;
	}

 */
//Eager approach
//public class Singleton{
//    //Eager vs Laxy
//    private static Singleton singleton=new Singleton();
//
//    private Singleton(){}
//
//    public static  Singleton getSingleton(){
//        return singleton;
//    }
//
//}

//Lazy apprach
//this pattern can be broken using java reflecation, using serilization, using clonnng
final public class Singleton{
    //Eager vs Laxy
    private  volatile static Singleton singleton;

    private Singleton(){}

    //race condition t1 t2 performance :(
    public  static  Singleton getSingleton(){
        if(singleton==null){
            synchronized (Singleton.class) {
               if(singleton==null){
                   singleton = new Singleton();
               }
            }
        }
        return singleton;
    }

}

//int i=5;
//long i=5;read in two step
















