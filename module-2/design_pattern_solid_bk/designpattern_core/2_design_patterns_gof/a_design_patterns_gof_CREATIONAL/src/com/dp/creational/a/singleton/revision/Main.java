package com.dp.creational.a.singleton.revision;
import java.util.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

//oops--ex handling--colletion and threads

public class Main {

	public static void main(String[] args) throws CloneNotSupportedException, FileNotFoundException, IOException, ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException  {
		
		Singleton singleton=Singleton.getSingleton();
		System.out.println(singleton.hashCode());
		
		//how to call private ctr using java reflection
		
		Class<?> clazz=Class.forName("com.dp.creational.a.singleton.revision.Singleton");
		
		Constructor[]constructors=clazz.getDeclaredConstructors();
		
		constructors[0].setAccessible(true);
		
		Singleton singleton2=(Singleton) constructors[0].newInstance();// it is calling private ctr, 
		
		System.out.println(singleton2.hashCode());
		
		
		
		//ser
//		ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(new File("demo.txt")));
//		
//		oos.writeObject(singleton);
		
		//de-ser
//		ObjectInputStream ois=new ObjectInputStream(new FileInputStream("demo.txt" ));
//		Singleton singleton2=(Singleton) ois.readObject();
//		
//		System.out.println(singleton2.hashCode());
		
	}
	
	
}
