package com.session3.a.ann_innerclass;

public class DemoLambdaVsAnnoThis {

    //laxical scope
    void foo(){
        int i=55;
        Cal c1=( a,  b)-> {
            System.out.println(i);
            return a+b;//lamabda is a peice of code that can pass inside a method call
        };

        Cal c3=new Cal() {
            int i=66;
            @Override
            public int add(int a, int b) {
                System.out.println(this.i);
                return a+b;
            }
        };

        int result= c1.add(2,2);
    }
}
