package com.session3.a.ann_innerclass;
//ann inner class
interface Foodish{
    void food();
}
public class C_AnnInnerClass {
    public static void main(String[] args) {

        //ann inner class vs lambada

        //ann inner class ka apan this hota hey
        //but lamada ka apan this nahi hota...lamada have laxical scope

        //labda is a peice of code vs ann inner class is a object*

//        int i=5;
//        Foodish f=new Foodish(){
//            int i=55;
//            @Override
//            public  void food(){
//                System.out.println(this.i);
//              System.out.println("street food good in taste...");
//            }
//        };
//        f.food();

        //java 8 compiler is more intellegent (type inteference)
        int i=5;
        Foodish f=()-> System.out.println("street food good in taste...");
        f.food();


//        Runnable r=()-> System.out.println("job of the thread");




    }
}
