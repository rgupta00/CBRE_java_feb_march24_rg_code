package com.session2.demo1.c.relationship_bw_objects.inh;





class X{
    int i=6;
    void foo(){
        System.out.println("HI");
    }
}
class Y extends X{
    int i=60;//Shadowing concept in OO
    void foo(){
        System.out.println("BYE "+i);
        System.out.println("BYE "+super.i);
        super.foo();
    }
}
class Z extends Y{
    int i=90;
    void foo(){
        System.out.println("Namaskar "+ i);
        System.out.println("Namaskar "+ super.i);
        super.foo();
    }
}


//class X{
//    int i=6;
//    void foo(){
//        System.out.println("HI");
//    }
//}
//class Y{
//    int i=60;
//    void foo(){
//        System.out.println("BYE");
//    }
//}
//class Z extends X,Y{
//    //which i?
//}
public class WhyNotMultipleInh {

    public static void main(String[] args) {

        Z z=new Z();
        z.foo();
    }
}
