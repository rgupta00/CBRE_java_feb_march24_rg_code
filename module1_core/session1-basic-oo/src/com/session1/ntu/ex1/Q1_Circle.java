package com.session1.ntu.ex1;
class Circle{
    private double radius=1.0;
    private String color= "red";

    public Circle(){
    }

    public Circle(double radius){
        this.radius=radius;
    }

    public double getRadius(){
        return radius;
    }


    public double getArea(){
        return Math.PI*radius*radius;
    }

}
public class Q1_Circle {
    public static void main(String[] args) {

            Circle circle=new Circle(7);
        System.out.println(circle.getArea());
        System.out.println(circle.getRadius());

    }
}







