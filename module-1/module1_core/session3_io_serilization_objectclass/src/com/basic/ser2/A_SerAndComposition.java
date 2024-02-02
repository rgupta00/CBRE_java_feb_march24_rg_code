package com.basic.ser2;

import com.basic.ser1.Account;

import java.io.*;

//jakson paraser object <-> json
//xml paraser object <-> xml
//all the composite object must be seril.... then it will not fail
class Collor{
    int size;
}
//juddad
class Dog implements Serializable{
    transient  Collor collor;
     String dogName;

     //----------this method is used to call when i am doing writeObject

     private void writeObject(ObjectOutputStream oos) throws IOException {
         oos.defaultWriteObject();
         oos.writeInt(collor.size);
     }

    //----------this method is used to call when i am doing readObject
    private void readObject(ObjectInputStream ois) throws IOException, ClassNotFoundException {
       ois.defaultReadObject();
        collor=new Collor();
        collor.size=ois.readInt();
    }

}
public class A_SerAndComposition {
    public static void main(String[] args)throws Exception {
        ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(new File("dataser.ser")));
        Dog dog=new Dog();
        dog.dogName="foo";
        Collor collor=new Collor();
        collor.size=28;

        dog.collor=collor;

        oos.writeObject(dog);

        dog=null;

        ObjectInputStream ois=new ObjectInputStream(new FileInputStream(new File("dataser.ser")));
        dog=(Dog) ois.readObject();
        System.out.println(dog.dogName);
        System.out.println(dog.collor.size);

        System.out.println("--------------------");

    }
}
