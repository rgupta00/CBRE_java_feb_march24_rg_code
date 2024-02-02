package com.threads.session1.classical_threads;

class Job implements  Runnable{
    @Override
    public void run() {
        //Thread.currentThread(): it get the contextaul inforation of threads
        System.out.println(Thread.currentThread().getName() + " "+ Thread.currentThread().getPriority()+" job started");
        try{
            Thread.sleep(1000);
        }catch (InterruptedException e){}
        System.out.println(Thread.currentThread().getName() + " "+ Thread.currentThread().getPriority()+" job ended");
    }
}
public class A_HelloWorld {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName() + " "+ Thread.currentThread().getPriority()+" : start");
        //Job
        Job job=new Job();
        //worker
        Thread thread=new Thread(job,"a");
        thread.setPriority(Thread.MAX_PRIORITY);

        Thread thread2=new Thread(job,"b");

        Thread thread3=new Thread(job,"c");

        thread.start();
        thread2.start();
        thread3.start();

       try{
           thread.join();
           thread2.join();
           thread3.join();
       }catch (InterruptedException e){}

        System.out.println(Thread.currentThread().getName() + " "+ Thread.currentThread().getPriority()+" : end");
    }
}
