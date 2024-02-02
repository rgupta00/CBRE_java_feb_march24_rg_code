package com.session1;
//inhiertance
/*
    Prime purpose in inheritance is reusablity of code : X

    extenablity: extends
    subtitutablity: overring

    reusablity: it can be achive using has a also: is a , has a

    Best prac: SOLID*
    "favour composition over inheritance while doing code resublity"

 */
//class A{
//    public A(){
//        System.out.println("it is a ctr A");
//    }
//    public void show(){
//        System.out.println("show of class A");
//    }
//}
//class B extends A{
//    public B(){
//        super();
//        System.out.println("it is a ctr B");
//    }
//
//    public void show(){
//        super.show();
//        System.out.println("show of class B");
//    }
//}

class A{
    private int i;
    public A(int i) {
        this.i = i;
    }
    public void show(){
        System.out.println("value of i: "+ i);
    }
}
class B extends A{
   private int j;

   public B(int i, int j){
       super(i);
       this.j=j;
   }
    public void show(){
       super.show();
        System.out.println("value of j: "+ j);
    }
}

public class I_Is_A {
    public static void main(String[] args) {
        //Runtime poly...? decision run time per hota hey
        A b=new B(1,3);
        b.show();

    }
}

















