package com.session1;

class Cal{
    public long add(long a, int b){
        System.out.println("public long add(long a, int b)");
        return a+b;
    }
    public long add(int a, long b){
        System.out.println("public long add(int a, long b)");
        return a+b;
    }

}
class ImporvedCal extends Cal{

}
public class K_FunOverloading {
    public static void main(String[] args) {
        Cal c=new Cal();
        System.out.println(c.add(3L,6));
    }
}
