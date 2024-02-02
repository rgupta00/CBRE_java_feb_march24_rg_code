package com.basic.ser3;

import com.basic.ser1.Account;

import java.io.*;

class MySingleton implements Serializable{

    private MySingleton(){}

    private static MySingleton mySingleton=new MySingleton();

    public static MySingleton getMySingleton(){
        return mySingleton;
    }
    //hey jvm u should not do de-ser
    private Object readResolve(){
        System.out.println("&&&&&");
        return mySingleton;
    }

}
public class SerAndSingleton {

    public static void main(String[] args)throws Exception {
        MySingleton mySingleton=MySingleton.getMySingleton();
        System.out.println(mySingleton.hashCode());

        ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(new File("dataser.ser")));
        oos.writeObject(mySingleton);

        ObjectInputStream ois=new ObjectInputStream(new FileInputStream(new File("dataser.ser")));
        MySingleton mySingleton2=(MySingleton) ois.readObject();

        System.out.println(mySingleton2.hashCode());
    }
}
