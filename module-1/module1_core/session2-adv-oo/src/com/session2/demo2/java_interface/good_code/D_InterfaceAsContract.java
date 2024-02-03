package com.session2.demo2.java_interface.good_code;
//raj ---Stack(interface)- Amit Sumit
//Stack-> AmitStack(pushAmit,popAmit)
//         SumitStack(pushSumitMethod,popSumitMethod)
//in this case why u have not used abs class
//DS: ADT
interface Stack{
    public void push(int data);
    public int pop();
}

class StackImplUsingArrays implements Stack{
    private int top;
    private int arr[];
    private final int SIZE=5;

    public StackImplUsingArrays() {
        top=-1;
        arr=new int[SIZE];
    }
    public void push(int data){
        if(top==SIZE-1){
            System.out.println("stack is full");
            return;
        }
        arr[++top]=data;
    }
    public int pop(){
        if(top==-1){
            System.out.println("stack is empty");
            return 999;
        }
        return arr[top--];
    }
}

class StackImplUsingLinkList{
    private int top;
    private int arr[];
    private final int SIZE=5;

    public StackImplUsingLinkList() {
        top=-1;
        arr=new int[SIZE];
    }
    public void push(int data){
        if(top==SIZE-1){
            System.out.println("stack is full");
            return;
        }
        arr[++top]=data;
    }
    public int pop(){
        if(top==-1){
            System.out.println("stack is empty");
            return 999;
        }
        return arr[top--];
    }
}
public class D_InterfaceAsContract {
    public static void main(String[] args) {
        //interface act as a contract bw 2 parties

        Stack s=new StackImplUsingArrays();
        s.push(3);
        s.push(9);
        s.push(1);
        s.push(2);
        s.push(30);

        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());






    }
}
