package com.session2.demo2.java_interface;
//ISP
interface Foo1{
    void foo();
    void bar();
}
interface Foo2{
    void jar();
    void kar();
}

abstract class FooImpl implements Foo2{
    @Override
    public void jar() {
    }
    @Override
    public void kar() {
    }
}
class Foo2Impl implements Foo1{
    @Override
    public void foo() {
    }
    @Override
    public void bar() {
    }

}

class Foo3Impl implements Foo1, Foo2{
    @Override
    public void foo() {
    }

    @Override
    public void bar() {
    }

    @Override
    public void jar() {
    }

    @Override
    public void kar() {

    }
}
public class DoubtsOnInterface {
    public static void main(String[] args) {

    }
}
