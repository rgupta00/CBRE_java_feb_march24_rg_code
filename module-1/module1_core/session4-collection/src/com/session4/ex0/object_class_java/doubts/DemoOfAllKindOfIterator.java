package com.session4.ex0.object_class_java.doubts;

import java.util.*;

public class DemoOfAllKindOfIterator {

    public static void main(String[] args) {

        //3 kind of iterator: Iterator , ListIteator, Enumeration

        List<String> list=new ArrayList<>();
        list.add("foo");
        list.add("bar");
        list.add("cat");//remove
        list.add("foo");//Mr foo
        ListIterator<String> it=list.listIterator();

        System.out.println(list);
        while (it.hasNext()){
           String data=it.next();
           if(data.equals("cat"))
               it.remove();
            if(data.equals("foo"))
                it.set("Mr foo");
            if(data.equals("foo"))
                it.add("new foo");
        }

        System.out.println(list);

//        ListIterator<String> it=list.listIterator(list.size());
//        while (it.hasPrevious()){
//            System.out.println(it.previous());
//        }

//        ListIterator<String> it=list.listIterator();
//        while (it.hasNext()){
//            System.out.println(it.next());
//        }

//        Iterator<String> it=list.iterator();




//        Vector<String> vector=new Vector<String>();
//        vector.add("foo");
//        vector.add("bar");
//        //System.out.println(vector);
//        Enumeration<String> it=  vector.elements();
//        while (it.hasMoreElements()){
//            System.out.println(it.nextElement());
//        }
    }
}
