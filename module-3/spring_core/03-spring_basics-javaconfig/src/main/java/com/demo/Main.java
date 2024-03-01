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
                new AnnotationConfigApplicationContext(AppConfig.class);

        Car car= (Car) applicationContext.getBean("foo");
        car.move();

    }
}