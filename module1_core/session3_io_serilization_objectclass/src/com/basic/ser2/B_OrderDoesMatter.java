package com.basic.ser2;

import java.io.Serializable;

class A implements Serializable{}
class B implements Serializable{}
class C implements Serializable{}


public class B_OrderDoesMatter {
    public static void main(String[] args) {
    // ser of A, then then Object B, then Object of C
        //de-ser follow the same order A-> B -> C   CCEx
    }
}
