package com.dp.behavioural.a.iterator_dp;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class WhatIsThePuposeOfIteratorDP {
    public static void main(String[] args) {
        List<String> list1=new ArrayList<>();//array it is a growable array


        List<String> list2=new LinkedList<>();// aka doubly ll

        //you dont have to worry about internals of ds, u just wanna to iterator it

       // Iterator<String> it=list1.iterator();
        Iterator<String> it=list2.iterator();



    }
}
