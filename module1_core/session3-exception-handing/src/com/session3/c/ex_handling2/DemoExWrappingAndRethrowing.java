package com.session3.c.ex_handling2;

//What is the use of it
class MyOwnEx extends RuntimeException{
    public MyOwnEx(String message, Throwable cause) {
        super(message, cause);
    }
}
public class DemoExWrappingAndRethrowing {
    public static void main(String[] args) {

        try{
            myMethod();
        }catch (MyOwnEx e){
            System.out.println("--------------------");
            System.out.println(e.getClass().getName());
            System.out.println(e.getCause());
        }
    }

    private static void myMethod() {
        try{
            int k=5/0;
        }catch (ArithmeticException e) {
            throw   new MyOwnEx(e.getMessage(), e);
        }
    }
}
