package com.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //aka manual DI, programmer need to do that
        //i want that a framewrok should do that job
        //di job=> spring framwrok act as a IOC container
//        Tyre tyre=new CeatTyre();
//        Car car=new Car();
//        car.setTyre(tyre);
//        car.move();

        ApplicationContext applicationContext=
                new ClassPathXmlApplicationContext("demo.xml");

        Car car= (Car) applicationContext.getBean("foo");
        car.move();
        //singleton dp: spring bean are singleton by default
        //singlet vs prototype(every time u get a diff object)
        Car car2= (Car) applicationContext.getBean("foo");
        System.out.println(car.hashCode());
        System.out.println(car2.hashCode());
    }
}