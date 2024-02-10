package com.day5.ex6.map_examples;
import java.util.*;
/*
    basics of map
    how to put data
    how to iterate map
    find element
    how it works?
 */
public class A_HelloMap {
    public static void main(String[] args) {
        //Map: assciatative array LL and Map
       //Map: HashMap, LinkedHashMap, TreeMap

        //HashMap is using hashing
        //performance of lookup is O(1)

        Map<String, Integer> map=new HashMap<>(20, 0.9f);
        map.put("raj",90);
        map.put("ekta",97);
        map.put("amit",70);
        map.put("amit",90);
        map.put("gunika",100);

        //how to print it
        //keyset vs entryset performance
        //entryset is better in performance

//        Set<String> keys = map.keySet();
//        for(String key: keys){
//            System.out.println( key+ ": "+map.get(key));
//        }

//        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
//
//        for(Map.Entry<String, Integer> entry: entrySet){
//            System.out.println(entry.getKey()+": "+ entry.getValue());
//        }


       //funcational programming in java? java 8
      //  map.forEach((a, b)-> System.out.println(a+": "+b));


        //how map internally works

    }
}
