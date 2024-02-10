package com.threads.session1.classical_threads;
/*
    How to create a thread?
    Job worker anology, different way to create java threads
 */
class MyJob implements Runnable{
    @Override
    public void run() {
        System.out.println("it is job stated by "+Thread.currentThread().getName());
        try{
            Thread.sleep(1000);
        }catch (InterruptedException ex){}

        System.out.println("it is done stated by "+Thread.currentThread().getName());
    }
}
public class A_CreatingThreads {
    public static void main(String[] args) throws Exception {


        //Thread pool

        MyJob job=new MyJob();
        Thread t1=new Thread(job);
        Thread t2=new Thread(job);
        Thread t3=new Thread(job);

        t1.start();
        t2.start();
        t3.start();

        t1.join();//InterreptedEx
        t2.join(2000,3000);//InterreptedEx
        t3.join();//InterreptedEx


        System.out.println("main is done");
//        Runnable runnable=new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("job of thred");
//            }
//        };
//        MyJob job=new MyJob();
//        Thread t=new Thread(runnable);
//        t.start();

//        Runnable runnable=()-> System.out.println("job of thred");
//
//        MyJob job=new MyJob();
//        Thread t=new Thread(runnable);
//        t.start();

//        System.out.println("main is job stated by "+Thread.currentThread().getName());
//
//        MyJob job=new MyJob();
//        Thread t=new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("this is job done by thead "+Thread.currentThread().getName());
//            }
//        },"A");
//        t.start();
//
//        System.out.println("main is job done by "+Thread.currentThread().getName());
    }
}
