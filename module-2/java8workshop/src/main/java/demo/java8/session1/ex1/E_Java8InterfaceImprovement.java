package demo.java8.session1.ex1;

import java.util.ArrayList;
import java.util.List;

//me java 7
interface Stack{
    public void push(int x);
    public int pop();

    public default int peek(){
        return -1;
    }
    public static void stackStatic(){
        System.out.println("static method can be put inside interface");
    }
}

//navneet
class StackImpl1 implements Stack{

    @Override
    public void push(int x) {

    }
    @Override
    public int pop() {
        return 0;
    }
}


//rashim
class StackImpl2 implements Stack{

    @Override
    public void push(int x) {

    }

    @Override
    public int pop() {
        return 0;
    }

    @Override
    public int peek() {
        return 10;
    }
}


public class E_Java8InterfaceImprovement{
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        Stack s=new StackImpl2();

        Stack.stackStatic();

        //Collections.
    }
}
