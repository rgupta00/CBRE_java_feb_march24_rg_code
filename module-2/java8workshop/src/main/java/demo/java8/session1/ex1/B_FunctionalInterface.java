package demo.java8.session1.ex1;
//stream procssing --> lambada exp--> funcational interface
//What is funcational interface? why it is important?
//funcational interface is the interface that support "funcational programming"
//is a new programing approach, declartive programming approach that can be used wit OO approach

//funcational interface: is a interface with only one abs method
//@FunctionalInterface
//interface MyInterface{
//    void foo();
//}

//@FunctionalInterface
//interface MyInterface{
//    void foo();
//    void bar();
//}
//@FunctionalInterface
//interface MyInterface{
//    void foo();
//    void foo1();
//    default void bar(){
//
//    }
//    public static void fooStatic(){
//
//    }
//}

// "funcational programming" can be expressed in the term of lambada
@FunctionalInterface
interface MyInterface{
    void foo();
}

interface CalculatorApi{
    int add(int a, int b);
}
public class B_FunctionalInterface {
    public static void main(String[] args) {
        //step 1
//        CalculatorApi calculatorApi=new CalculatorApi() {
//            @Override
//            public int add(int a, int b) {
//                return a+b;
//            }
//        };
//
        //step 2
//        CalculatorApi calculatorApi=(int a, int b)-> {
//                return a+b;
//
//        };

//        //step 3
//        CalculatorApi calculatorApi=( a,  b)-> {
//            return a+b;
//        };

        //step 4
        CalculatorApi calculatorApi=( a,  b)-> a+b;




        //ann -> lambada
//        MyInterface myInterface=new MyInterface() {
//            @Override
//            public void foo() {
//                System.out.println("foof is defined");
//            }
//        };

        //java 8 compiler was more inter.. then java 7 compiler
        //type inference

        //hum lambda kab lik sakte hey
        //iff it is functional interface
        MyInterface myInterface=()-> System.out.println("foof is defined");

    }
}
