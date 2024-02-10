package com.threads.session1.classical_threads;

import java.io.BufferedReader;
import java.io.FileReader;

class JobWithEx implements  Runnable{
    @Override
    public void run(){
        try(BufferedReader reader = new BufferedReader(new FileReader("foo.txt"))){
            ///
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }
}
class MyExHandler implements Thread.UncaughtExceptionHandler{
    @Override
    public void uncaughtException(Thread t, Throwable e) {
        System.out.println(t.getName()+": "+ e.getCause());
    }
}

public class D_HandingExInThreads {

    public static void main(String[] args) {

          JobWithEx job=new JobWithEx();
          Thread thread=new Thread(job);
          thread.setUncaughtExceptionHandler(new MyExHandler());
          thread.start();




    }
}
