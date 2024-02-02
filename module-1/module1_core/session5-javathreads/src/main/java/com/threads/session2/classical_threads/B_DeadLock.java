package com.threads.session2.classical_threads;

public class B_DeadLock {
    public static void main(String[] args) {

        Object r1="bat";
        Object r2="ball";

        Thread t1=new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (r1){
                    System.out.println("t1 got lock on r1");
                    try{
                        Thread.sleep(1000);
                    }catch (InterruptedException e){}
                    synchronized (r2){
                        System.out.println("t1 got lock on r2");
                    }
                }
            }
        });


        Thread t2=new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (r1){
                    System.out.println("t2 got lock on r1");
                    try{
                        Thread.sleep(1000);
                    }catch (InterruptedException e){}
                    synchronized (r2){
                        System.out.println("t2 got lock on r2");
                    }
                }
            }
        });

        t1.start();
        t2.start();
    }
}
