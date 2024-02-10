package com.day5.ex8.a.generics_example;
import java.util.*;
public class B_UndersingNeedOfSuperAndExtends {
    public static void main(String[] args) {

        //Number

        List<Integer> list=new ArrayList<>();
        list.add(66);
        list.add(606);

        printMe(list);

        List<Double> list2=new ArrayList<>();
        list2.add(66.0);
        list2.add(606.0);

        printMe(list2);

    }
    //PES
    //? extends Number: jab hum sirf print karan chata he
//    //u can not add the elements
    //u can not add the elements
    static void printMe(List<? extends Object> list) {
        // list.add(669); //java can not say with the surety that data is comptable
        for(Object val: list){
            System.out.println(val);
        }
    }



//     static void printMe(List<? extends Number> list) {
//       // list.add(669); //java can not say with the surety that data is comptable
//        for(Number val: list){
//            System.out.println(val);
//        }
//    }


    //PECS rules
    //? extends XXX : upper bound
    //? super XXX: lower bound

//    private static void printMeDouble(List<Double> list) {
//        for(Double val: list){
//            System.out.println(val);
//        }
//    }
//
    //DRY: dont repeat code
//    private static void printMeInteger(List<Integer> list) {
//        for(Integer val: list){
//            System.out.println(val);
//        }
//    }
}
