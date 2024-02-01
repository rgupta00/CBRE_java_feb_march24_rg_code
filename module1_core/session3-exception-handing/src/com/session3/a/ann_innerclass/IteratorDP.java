package com.session3.a.ann_innerclass;

//Head first : design iterator dp

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IteratorDP {
    public static void main(String[] args) {
        //Array
        List<String> list=new ArrayList<>();

        //LL
        List<String> list2=new LinkedList<>();

        //:)
        Iterator<String> it=list.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

        Iterator<String> it2=list2.iterator();
        while (it2.hasNext()){
            System.out.println(it.next());
        }

    }
}
