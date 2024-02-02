package com.day5.ex5.generics_demo.f;
//class Stack

import java.lang.reflect.Array;

class Stack<T extends  Comparable<T>>{
    int top;
    T arr[];
    int MAX_SIZE=5;

    public Stack( Class<T>clazz, int cap){
        arr = (T[]) Array.newInstance(clazz, cap);
        top=-1;
    }
    public T pop(){
        if(top==-1)
            throw new IllegalStateException("stack is empty");
       return arr[top--];
    }
    public void push(T data){
        if(top==MAX_SIZE-1)
            throw new IllegalStateException("stack is FULL");
         arr[++top]=data;
    }

}
public class DemoStack {
    public static void main(String[] args) {
        //if we are adding any object in this adding/removing then we have memory leak ..find at correct it
        Stack<Integer> s=new Stack<>( Integer.class, 5);
        s.push(3);
        s.push(35);
        s.push(43);
        s.push(38);
        s.push(113);

        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
       // System.out.println(s.pop());



    }
}
