package com.session1;

import java.util.Scanner;
//kab hum ab class kub interface?

//IQ vs EQ

//interface.. java 8

//abs classes

//abstract class Shape{
//    abstract void draw();
//}
interface  Shape{
     void draw();
}
class Circle implements Shape{
    public void draw(){
        System.out.println("circle shap");
    }
}

class Square implements Shape{
    public void draw(){
        System.out.println("sq shap");
    }
}
public class J_WhatUMeanOverriding {
    public static void main(String[] args) {
       //run time flexablity



        Scanner scanner=new Scanner(System.in);
        System.out.println("PE 1 for circle and 2 for sq");
        int choice= scanner.nextInt();

        Shape shape=null;

        if(choice==1){
            shape=new Circle();
        }else  if(choice==2){
            shape=new Square();
        }

        if(shape!=null){
            shape.draw();
        }
    }
}
