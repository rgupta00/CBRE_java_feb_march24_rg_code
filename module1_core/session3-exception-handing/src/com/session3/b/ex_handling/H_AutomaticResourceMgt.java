package com.session3.b.ex_handling;

import java.util.Arrays;

class Door implements  AutoCloseable{

    public void doLogicDoor(){
        System.out.println("logic of door");
        throw new NullPointerException("NPE");
    }
    public Door() {
        System.out.println("ctr of door");
    }
    @Override
    public void close() throws Exception {
        System.out.println("closing the door");
        throw new ArithmeticException("ArithmeticException");
    }
}
class Window implements  AutoCloseable{
    public void doLogicWindow(){
        System.out.println("logic of Window");
    }
    public Window() {
        System.out.println("ctr of Window");
    }
    @Override
    public void close() throws Exception {
        System.out.println("closing the Window");
    }
}

public class H_AutomaticResourceMgt {
    public static void main(String[] args) {
        //kab lagaga? ARM can be applied to a class iff it extends a class ie called AutoClosbable
        try(Door door=new Door()){
            door.doLogicDoor();
        }catch (Exception ex){
            System.out.println(ex.getClass().getName());
             Throwable[] throwables= ex.getSuppressed();
             Arrays.asList(throwables).forEach(e-> System.out.println(e));
        }


//
//        try(Door door=new Door(); Window window=new Window()){
//            door.doLogicDoor();
//            window.doLogicWindow();
//        }catch (Exception ex){
//            ex.printStackTrace();
//        }

    }
}
