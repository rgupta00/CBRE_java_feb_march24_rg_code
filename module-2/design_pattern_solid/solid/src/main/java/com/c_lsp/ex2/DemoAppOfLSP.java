package com.c_lsp.ex2;

import java.util.LinkedList;

/*
FIFO
implement Queue using LL
 */
//class MyQueue extends LinkedList<String>{
//    public void addData(String data){
//        addLast(data);
//    }
//    public String removeData(){
//       return removeFirst();
//    }
//}

//improved design
class MyQueue {
    private LinkedList<String> list;

    public MyQueue(){
        list=new LinkedList<>();
    }
    public void addData(String data){
        list.addLast(data);
    }
    public String removeData(){
        return list.removeFirst();
    }
}
public class DemoAppOfLSP {
    public static void main(String[] args) {
        MyQueue myQueue=new MyQueue();

        myQueue.addData("raj");
        System.out.println(myQueue.removeData());

    }
}
