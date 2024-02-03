package com.session1;
class A1{
    void printA1(){
        System.out.println("print A1");
    }
}
class B1 extends A1{
    void printB1(){
        System.out.println("print B1");
    }
}
class C1 extends A1{
    void printC1(){
        System.out.println("print C1");
    }

}
public class M_UpcastingAndDownload {

    public static void main(String[] args) {
        A1 a1=new B1();//ok
        A1 a2=new C1();//ok

       // B1 b1=new A1();// it will not work

//        B1 b1=(B1)a1;
//        b1.printA1();
//        b1.printB1();

        B1 b1=(B1)a2;
        b1.printA1();
        b1.printB1();

    }
}
