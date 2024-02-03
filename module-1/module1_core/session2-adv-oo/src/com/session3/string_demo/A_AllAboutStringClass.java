package com.session3.string_demo;


public class A_AllAboutStringClass {
    public static void main(String[] args) {
        //String is the only class in java for which new operation is not requation
        //string are immutable
        //string vs string builder vs stringbuffer


//        String s="india";
//        String s2=new String("india");
//
//        if(s==s2)
//            System.out.println("are eq");
//        else
//            System.out.println("not eq");


//        String s="india";
//        String s2=new String("india");
//
//        if(s.equals(s2))
//            System.out.println("are eq");
//        else
//            System.out.println("not eq");


//        String s="india";
//        String s2="india";
//
//        if(s==s2)
//            System.out.println("are eq");
//        else
//            System.out.println("not eq");

        //string vs string builder vs stringbuffer

        String s="foo"+"bar"+"car"+"jar";//this is a bad code

       // StringBuffer thread safe but slow syn
        //StringBuilder it is not thraed safe.. it is better in performance

        //
//        String s2=new StringBuilder().append("foo").append("bar").append("jar").append("car").toString();
//
//        String data="i love java";
//        String data2=new StringBuilder().append("i love java").reverse().toString();


    }
}
