package com.session2.demo1.b.poly;
//1: Base: Krishna Daily
class Milk{
}
class PasteurizedMilk extends Milk{

}
class KrishnaDaily{
    public Milk sellMilk(){
        System.out.println(" public Milk sellMilk(): normal ");
        return new Milk();
    }
}
//Java 5: Covarient return type

class ImprovedKrishnaDaily extends KrishnaDaily{
    @Override
    public PasteurizedMilk sellMilk(){
        System.out.println(" public Milk sellMilk(): pasteurized milk ");
        return new PasteurizedMilk();
    }
}
//2: Derived

public class B_DemoOverriding {
    public static void main(String[] args) {

        //Run time flexiblity
        KrishnaDaily krishnaDaily=new ImprovedKrishnaDaily();

        krishnaDaily.sellMilk();


    }
}








