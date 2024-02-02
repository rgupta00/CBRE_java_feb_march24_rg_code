package com.session3.a.ann_innerclass;
//ds: LL, Stack, Queue..
//Assocation : aggrigation and compostion
//java collection: iterator dp GOF
class LL{
    class Node{

    }
}
//better encapsulation
//inner class :Top level inner class

class A11{
    private  class B1{}
    protected  class B2{}
    public class B3{}
    final class B4{}

    //...
}
class Outer{
    private  int temp=55;
    //mama and kid relationship, inner class can access ever access private data of outer class
    private   class  Inner{
        private  int temp=555;
        void foo(){
            System.out.println(Outer.this.temp);
            System.out.println(this.temp);
            System.out.println("foo of Inner class");
        }
    }
    //static method dont hv "this"
    public   void foof(){
        Inner in=this.new Inner();
        in.foo();
    }
}
public class A_TopLevelInnerClass {
    public static void main(String[] args) {
        Outer o=new Outer();
        o.foof();
//        Outer.Inner in=new Outer().new Inner();
//        in.foo();
    }
}
