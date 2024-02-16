package demo.java8.session1.ex1;

import java.util.*;

@FunctionalInterface
interface MyName{
    public int getChar(String name);
}
public class B2_MoreExOnLambada {
    public static void main(String[] args) {


        MyName myName= name-> name.length();

        Runnable runnable=()-> System.out.println("it is the job");

        List<String> names=new LinkedList<>();
        names.add("ekta");
        names.add("vijay");
        names.add("keshav g");
        System.out.println(names);
        Collections.sort(names);
        System.out.println("sorted in asc");
        System.out.println(names);

        //Comparator<String> stringComparator=( o1,  o2)-> o2.compareTo(o1);



//        System.out.println("sorted in dec");
//        Collections.sort(names,( o1,  o2)-> o2.compareTo(o1) );
//        System.out.println(names);


        System.out.println("sorted in dec");
        Collections.sort(names,Comparator.reverseOrder());
        System.out.println(names);
    }
}
