package com.day5.ex2.set_examples;
import java.util.*;
public class H_DemoMapWithUerDefineKey {
    public static void main(String[] args) {

        Map<Key, String> map=new HashMap<>();
        map.put(new Key(33),"33");
        map.forEach((k,v)-> System.out.println(k+" : "+ v));
        System.out.println(map.get(new Key(33)));

    }
}
