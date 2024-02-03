package com.session2.demo2.java_interface;

//SO L ID
//class Monkey{
//    void stayOnTree(){
//        System.out.println("stay on tree");
//    }
//    void biteThePerson(){
//        System.out.println("biteThePerson");
//    }
//
//    void jump(){
//        System.out.println("jump");
//    }
//}
//
//class Kid extends Monkey{
//    void doingHomeWork(){
//        System.out.println("doingHomeWork :(");
//    }
//    void jump(){
//        System.out.println("kid jump better then monkey");
//    }
//}
interface Jumpable{
    void jump();
}
class Monkey implements Jumpable{
    void stayOnTree(){
        System.out.println("stay on tree");
    }
    void biteThePerson(){
        System.out.println("biteThePerson");
    }

    public void jump(){
        System.out.println("jump");
    }
}

class Kid implements Jumpable{
    void doingHomeWork(){
        System.out.println("doingHomeWork :(");
    }
    public  void jump(){
        System.out.println("kid jump better then monkey");
    }
}

public class F_NeedOfInterface {
    public static void main(String[] args) {

    }
}
