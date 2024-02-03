package com.session2.demo2.java_interface;
//interface ShirtSize{
//    int S=38;
//    int M=40;
//}
//class ShirtSize{
//    public  static final int S=38;
//    public  static final  int M=40;
//}
//enum
enum ShirtSize{
    S,M;
}
public class B_InterfaceAsContract {
    public static void main(String[] args) {
        System.out.println(ShirtSize.M);
    }
}
