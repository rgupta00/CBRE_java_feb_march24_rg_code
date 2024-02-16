package demo.java8.session1.ex1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class F_Consumer {
    public static void main(String[] args) {
    //java 8 in action
        //Rajeev 9958543978 notes
        Consumer<String> consumer= s -> System.out.println(s);

        consumer.accept("we are all champs!");

        BiConsumer<String, String>consumer1=(s1,s2)-> System.out.println(s1+": "+ s2);

        Map<Integer, String>s=new HashMap<>();
        s.put(1,"raj");
        s.put(4,"sumit");
        s.put(13,"kapil");

       // s.forEach((k, v)-> System.out.println(k+": "+v));

        s.entrySet().stream().forEach(e-> System.out.println(e.getKey()+": "+ e.getValue()));



    }
}
