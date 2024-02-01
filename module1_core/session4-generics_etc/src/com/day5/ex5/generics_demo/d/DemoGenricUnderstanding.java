package com.day5.ex5.generics_demo.d;

import java.io.Serializable;

class Data<T extends Serializable & Comparable>{
    T i;
    public T getI() {
        return i;
    }
    public void setI(T i) {
        this.i = i;
    }
}
public class DemoGenricUnderstanding {
    public static void main(String[] args) {

    }
}
