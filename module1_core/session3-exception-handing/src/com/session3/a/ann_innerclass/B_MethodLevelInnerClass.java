package com.session3.a.ann_innerclass;
class A1{
        //method local inner class
        void foo(){
            //java 7: the local variable need to be declare final
            //java 8: effectivly final
                 int temp=555;//clouser
                class M{
                    void foof(){
                        System.out.println("foof method of class M "+temp);
                    }
                }
                M m=new M();
                m.foof();

            //return m;
      }
}
public class B_MethodLevelInnerClass {
    public static void main(String[] args) {
        A1 a=new A1();
        a.foo();
    }
}
