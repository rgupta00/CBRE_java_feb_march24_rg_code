package com.basic.io;
// good morning --> very good morning --> sp very good morning
interface Greet{
    public String greet();
}
class SimpleGreet implements  Greet{
    @Override
    public String greet() {
        return "good morning";
    }
}
class SpGreet implements  Greet{
    private Greet greet;
    public SpGreet(Greet greet) {
        this.greet = greet;
    }
    @Override
    public String greet() {
        return "very "+ greet.greet() ;
    }
}
class VSpGreet implements  Greet{
    private Greet greet;
    public VSpGreet(Greet greet) {
        this.greet = greet;
    }
    @Override
    public String greet() {
        return "Sp "+ greet.greet() ;
    }
}

public class G_DecoratorDP {

    public static void main(String[] args) {
        Greet greet=new VSpGreet(new SpGreet(new SimpleGreet()));
        System.out.println(greet.greet());
    }
}
