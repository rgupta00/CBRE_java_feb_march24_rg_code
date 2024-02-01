package com.threads.session1.classical_threads;
//C_UsingAnnInnerClass vs labmbda
public class C_UsingAnnInnerClass {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName() + " "+ Thread.currentThread().getPriority()+" : start");


//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println(Thread.currentThread().getName() + " "+ Thread.currentThread().getPriority()+" : end");
//            }
//        }).start();

//        new Thread(() ->
//                System.out.println(Thread.currentThread().getName() + " "+ Thread.currentThread().getPriority()+" : end")).start();

        new Thread(C_UsingAnnInnerClass::foo).start();


        System.out.println(Thread.currentThread().getName() + " "+ Thread.currentThread().getPriority()+" : end");

    }

    public  static  void foo(){
        System.out.println(Thread.currentThread().getName() + " "+ Thread.currentThread().getPriority()+" : start");
    }
}
