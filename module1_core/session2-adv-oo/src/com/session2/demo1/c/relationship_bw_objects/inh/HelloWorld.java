package com.session2.demo1.c.relationship_bw_objects.inh;


class A{
    private  int i;

    A(int i){
        this.i=i;
    }
    public void show(){
        System.out.println("value of i: "+ i);
    }
}
class B extends A{
    private  int j;

    B(int i, int j){
        super(i);
        this.j = j;
    }
    public void show(){
        super.show();
        System.out.println("value of j: "+ j);
    }
}


public class HelloWorld {
    public static void main(String[] args) {

       B b=new B(33,77);
       b.show();
    }
}


//class A{
//    private  int i;
//    void foo(){
//        System.out.println("foo method ");
//    }
//}
//
//class B extends A{
//    void foo(){
//        System.out.println("foo of class B");
//        super.foo();
//    }
//}