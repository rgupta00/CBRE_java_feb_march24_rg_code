package com.session2.demo1.a.callby_value;
//Call by value

public class C_DemoCallbyValueVsRef3 {

    public static void main(String[] args) {

        Val i=new Val(5);
        System.out.println(i.getVal());
        changeIt(i);
        System.out.println(i.getVal());

    }
    public static void changeIt(Val foo) {
        foo.setVal(foo.getVal()+20);
    }
}
