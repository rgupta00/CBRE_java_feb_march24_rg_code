package com.session3.immutablity_demo;

import java.util.ArrayList;
import java.util.List;

public class DemoWrapper {
    public static void main(String[] args) {
      //java 5: autoboxing vs unboxing
        int i=4;
        Integer it=new Integer(22);
        //java 1.4
        Integer it2=4;

        int temp2=it2;
        


//        int temp= it.intValue()+1;
//        it=new Integer(temp);



//        Integer it=new Integer(22);
//        Integer it2=new Integer(22);

        Integer it=Integer.valueOf(128);
        Integer it2=128;

        System.out.println(it==it2);


    }
}
