package com.bankapp;

import java.util.Random;

public class Hello {
    public static void main(String[] args) {
        long no=1000_0000_0000_0000L+ (long)(Math.random()*900_0000_0000_0000L);
        System.out.println(no);
    }
}
