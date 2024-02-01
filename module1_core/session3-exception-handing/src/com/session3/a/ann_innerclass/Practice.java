package com.session3.a.ann_innerclass;

import java.util.Comparator;
//jis interface me ek he ab method hota hey usko "SAM" Single ab method, Funcational Interface
public class Practice {
    public static void main(String[] args) {

//        Comparator<String> comparator=new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o2.compareTo(o2);
//            }
//        };

//        Comparator<String> comparator=(String o1, String o2) ->{
//                return o2.compareTo(o2);
//
//        };

//        Comparator<String> comparator=( o1,  o2) ->{
//            return o2.compareTo(o2);
//
//        };

        Comparator<String> comparator=( o1,  o2) -> o2.compareTo(o2);

        //ex -> io -> collections -> generics --> java 8
    //higher order function
     //   streams().sort(comparator)


    }
}
