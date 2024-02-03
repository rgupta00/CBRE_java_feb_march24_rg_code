package com.session2.demo1.a.misc;
//Call by value
class Val{
    private int val;

    public Val(int val) {
        this.val = val;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }
}
public class B_DemoCallbyValueVsRef2 {

    public static void main(String[] args) {

        Val i=new Val(5);
        Val j=new Val(50);
        System.out.println("value of i:"+ i.getVal()+" value of j: "+j.getVal());
        swap(i, j);
        System.out.println("value of i:"+ i.getVal()+" value of j: "+j.getVal());

    }
    public static void swap(Val i, Val j) {
         Val temp=null;
         temp=i;
         i=j;
         j=temp;
    }
}
