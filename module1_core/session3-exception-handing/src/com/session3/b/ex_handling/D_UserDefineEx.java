package com.session3.b.ex_handling;
//java defined ex: BL
//Account -> withdraw and deposit
//OverFundException , NotSufficentFundException, AccountCreationExcpetion

class NegativeRadiusEx extends RuntimeException{
    public NegativeRadiusEx(String message) {
        super(message);
    }
}
//raj
class Circle{
    private int radius;

    public Circle(int radius) {
        if(radius<=0)
            throw new NegativeRadiusEx("-ve radius is not possible");
        this.radius = radius;
    }
    public double getArea(){
        return  radius* radius*Math.PI;
    }
}
public class D_UserDefineEx {
    public static void main(String[] args) {

        //amit
      try{
          Circle circle=new Circle(-2);
          System.out.println(circle.getArea());
      }catch (NegativeRadiusEx e) {
          e.printStackTrace();
      }


    }
}
