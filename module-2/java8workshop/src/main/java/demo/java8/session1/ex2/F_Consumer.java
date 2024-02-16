package demo.java8.session1.ex2;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class F_Consumer {
    public static void main(String[] args) {
    //java 8 in action//Rajeev  notes
        //What is consumer
//        Consumer<String > c1= s-> System.out.println(s);
//        c1.accept("raj");
//
//        Emp e=new Emp(11,"foo",8000);
//
//        Consumer<Emp> e2= emp-> System.out.println(emp);
//
//        e2.accept(e);

//        BiConsumer<String,Integer> consumer=( s,  i)-> System.out.println(s+": "+ i);

       //Data processing
//       List<String> data=List.of("raj","amit","sumit");
//       //higher order function
//        Consumer<String> c1=d-> System.out.println(d);
//       data.forEach(c1);

//       for(String d: data){
//           System.out.println(d);
//       }

        //map best way to iterator the map use java 8 steam
//        Map<String, Integer> map=new LinkedHashMap<>();
//        map.put("ekta",95);
//        map.put("raj",90);
//        map.put("keshav",97);
//
//        map.forEach((x,y)-> System.out.println(x+": "+ y));
//        map.entrySet().forEach( e-> System.out.println(e.getKey()+": "+ e.getValue()));

        Map<String, Integer> map=new HashMap<>();
        map.put("ekta",95);
        map.put("raj",90);
        map.put("keshav",97);

        //map.entrySet().forEach( e-> System.out.println(e.getKey()+": "+ e.getValue()));
//        map.entrySet().stream()
//                .sorted(Map.Entry.comparingByKey())
//                .forEach(e-> System.out.println(e.getKey()+": "+ e.getValue()));

//        map.entrySet().stream()
//                .sorted(Map.Entry.comparingByValue())
//                .forEach(e-> System.out.println(e.getKey()+": "+ e.getValue()));
    }
}
