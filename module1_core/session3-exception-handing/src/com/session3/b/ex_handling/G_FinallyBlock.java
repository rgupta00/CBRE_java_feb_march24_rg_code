package com.session3.b.ex_handling;

public class G_FinallyBlock {
    public static void main(String[] args) {
        //Why we need

        //good programming practice
        /*
            1. never return values form finally block
            2. never throw ex from finally block

         */
        try{
            myMethod();
        }catch (Exception e){
            System.out.println(e);
        }

    }

    private static int myMethod() {
        try{
             throw new NullPointerException("NullPointerException");

        }finally {
            throw new ArithmeticException("ArithmeticException") ;
        }
    }



//    private static int myMethod() {
//        try{
//            return 20;
//        }finally {
//            return 10;
//        }
//    }
}








