package com.session1;

import java.util.Scanner;

class Shape{
    void draw(){
        System.out.println("draw shap");
    }
}
class Circle extends Shape{
     void draw(){
        System.out.println("circle shap");
    }
}
class Square extends Shape{
    void draw(){
        System.out.println("sq shap");
    }
}
public class J_WhatUMeanOverriding {
    public static void main(String[] args) {
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
