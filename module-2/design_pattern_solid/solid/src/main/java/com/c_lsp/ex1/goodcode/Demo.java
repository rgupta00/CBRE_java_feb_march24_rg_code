package com.c_lsp.ex1.goodcode;
class D{
    public void bigHouse(){
        System.out.println("bigHouse...");
    }

    public void shootWithR(){
        System.out.println("i can shoot anybody...");
    }
}
class DS {
    private D d=new D();
    public void bigHouse(){
      d.bigHouse();
    }
}
public class Demo {
    public static void main(String[] args) {
       // DS d=new DS();
       // d.shootWithR();
    }
}
