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
class GenericExHandler implements Thread.UncaughtExceptionHandler{
    @Override
    public void uncaughtException(Thread t, Throwable e) {
        System.out.println(t.getName()+": "+ e.getCause()+" is is generic ex handler");
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

        //call back
        Thread.setDefaultUncaughtExceptionHandler(( t,  e)-> System.out.println(t.getName()+": "+ e));


//            Thread.setDefaultUncaughtExceptionHandler
//                    (( t,  e) -> System.out.println(t.getName()+": "+ e.getCause()));

            Thread t=new Thread(new JobWithEx(),"test1");
            t.setUncaughtExceptionHandler(new MyExHandler());
            t.start();



    }
}
