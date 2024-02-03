package com.session2.demo2.java_interface.bad_code;
//raj ---Stack(interface)- Amit Sumit
//Stack-> AmitStack(pushAmit,popAmit)
//         SumitStack(pushSumitMethod,popSumitMethod)


class AmitStack{
    private int top;
    private int arr[];
    private final int SIZE=5;

    public AmitStack() {
        top=-1;
        arr=new int[SIZE];
    }
    public void pushAmit(int data){
        if(top==SIZE-1){
            System.out.println("stack is full");
            return;
        }
        arr[++top]=data;
    }
    public int popAmit(){
        if(top==-1){
            System.out.println("stack is empty");
            return 999;
        }
        return arr[top--];
    }
}

class SumitStack{
    private int top;
    private int arr[];
    private final int SIZE=5;

    public SumitStack() {
        top=-1;
        arr=new int[SIZE];
    }
    public void pushSumitMethod(int data){
        if(top==SIZE-1){
            System.out.println("stack is full");
            return;
        }
        arr[++top]=data;
    }
    public int popSumitMethod(){
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

//        AmitStack s=new AmitStack();
//        s.pushAmit(3);
//        s.pushAmit(9);
//        s.pushAmit(1);
//        s.pushAmit(2);
//        s.pushAmit(30);
//
//        System.out.println(s.popAmit());
//        System.out.println(s.popAmit());
//        System.out.println(s.popAmit());
//        System.out.println(s.popAmit());
//        System.out.println(s.popAmit());





    }
}
