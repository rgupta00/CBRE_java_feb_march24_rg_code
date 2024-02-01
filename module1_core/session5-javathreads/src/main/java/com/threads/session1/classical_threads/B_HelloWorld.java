package com.threads.session1.classical_threads;

class MyThread extends Thread{
    @Override
    public void run() {
        //Thread.currentThread(): it get the contextaul inforation of threads
        System.out.println(Thread.currentThread().getName() + " "+ Thread.currentThread().getPriority());
    }

}
public class B_HelloWorld {
    public static void main(String[] args) {
        MyThread t=new MyThread();
        t.start();
    }
}
