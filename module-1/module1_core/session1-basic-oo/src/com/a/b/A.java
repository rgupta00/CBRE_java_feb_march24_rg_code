package com.a.b;
//default : package private

 public class A {
    private int i=6;
    int j=66;
    protected int k=666;
    public int l=6666;

    private void privateMethod(){
        System.out.println("private Method");
    }
     void defaultMethod(){
        System.out.println("default Method");
    }

    protected void protectedMethod(){
        System.out.println("protectd Method");
    }
    public void publicMethod(){
        System.out.println("public Method");
    }


}
