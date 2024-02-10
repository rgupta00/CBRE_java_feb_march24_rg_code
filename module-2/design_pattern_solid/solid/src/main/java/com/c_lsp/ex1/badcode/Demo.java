package com.c_lsp.ex1.badcode;
class D{
    public void bigHouse(){
        System.out.println("bigHouse...");
    }

    public void shootWithR(){
        System.out.println("i can shoot anybody...");
    }
}
class DS extends D{
    public void shootWithR(){
       throw  new RuntimeException("");
    }
}
public class Demo {
    public static void main(String[] args) {
        D d=new DS();
        d.shootWithR();
    }
}
