package com.day5.ex5.generics_demo.b;

import com.day5.ex3.comparator_comparable.EmpSorterAsPerName;

public class DemoGenericFuncation {
    public static void main(String[] args) {

        //int id, String name, String city, double salary
        Employee employee=new Employee(1,"raj","delhi",673999);
        Employee employee2=new Employee(71,"rai","delhi",973999);
        Employee employee3=new Employee(19,"kapil","delhi",633999);


        Integer a=91;
        Integer b=2;
        Integer c=3;
        Integer max=findMax(a, b , c);
        System.out.println(max);

        Employee eMax=findMax(employee, employee2,employee3);
        System.out.printf("emax: "+eMax);
    }

    static <T extends Comparable<T>>  T findMax(T a, T b, T c) {
        T max=a;
        if(b.compareTo(a)>0){
            max=b;
        }
        if(c.compareTo(max)>0){
            max=c;
        }
        return max;
    }

//     static Integer findMax(Integer a, Integer b, Integer c) {
//        Integer max=a;
//        if(b.compareTo(a)>0){
//            max=b;
//        }
//         if(c.compareTo(max)>0){
//             max=c;
//         }
//         return max;
//    }
}
