package com.session2.demo1.b.poly;

class A{
}
class B extends A{
}
class C extends  A{
}

public class D_UpcastingVsDownCasting {
    public static void main(String[] args) {

        A a1=new B();
        A a2=new C();

        if(a1 instanceof B) {
            B b1 = (B) a1;//CCEx}
            System.out.println("done");
        }else {
            System.out.println("not possible");
        }


        //B b=new B();

//        double i=6.003;
//        int j=(int)i;
//        System.out.println(j);

    }
}
