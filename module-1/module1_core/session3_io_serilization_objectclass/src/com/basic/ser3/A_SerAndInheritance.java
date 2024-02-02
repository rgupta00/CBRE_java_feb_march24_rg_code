package com.basic.ser3;

import com.basic.ser1.Account;

import java.io.*;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

//1. if base class is ser... then drive class automatically support ser...
//class BClass implements Serializable{}
//class CClass extends BClass{}

//1. if base class is not ser... then drive class is ser then what happen?

//creating a object by new and de-ser
//ctr is called      vs        ctr is not called

//if base class is not ser and derived class then ser dont fail
//but when u are doing de-ser then "instance control flow is called"
class MyFoo {
    int i=50;
    MyFoo() {
        System.out.println("ctr of MyFoo is called");
    }
}
class MyBar extends MyFoo implements Serializable{
    MyBar() {
        System.out.println("ctr of MyBar is called");
    }
}


public class A_SerAndInheritance {
    public static void main(String[] args)throws Exception {
        ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(new File("dataser.ser")));
        MyBar bar=new MyBar();
        bar.i=666;

        oos.writeObject(bar);

        bar=null;
        System.out.println("***********************************************");
        ObjectInputStream ois=new ObjectInputStream(new FileInputStream(new File("dataser.ser")));
         bar=(MyBar) ois.readObject();
        System.out.println(bar.i);
        System.out.println("--------------------");
    }
}
