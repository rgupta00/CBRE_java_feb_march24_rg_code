package com.dp.creational.c.builder.sol;

public class FoodBuilder {
    private String name;
    private int unit;
    private int vitC=900;
    private int vitA=500;
    private int vitB12=400;
    private int vitB5=1200;
    private int vitD=60000;

    public FoodBuilder(String name, int unit) {
        this.name = name;
        this.unit = unit;
    }

    public Food build(){
        //String name, int unit, int vitC, int vitA, int vitB12, int vitB5, int vitD
        return new Food(name, unit, vitC, vitA, vitB12, vitB5,vitD);
    }

    public FoodBuilder setVitC(int vitC) {
        this.vitC = vitC;
        return this;
    }

    public FoodBuilder setVitA(int vitA) {
        this.vitA = vitA;
        return this;
    }

    public FoodBuilder setVitB12(int vitB12) {
        this.vitB12 = vitB12;
        return this;
    }

    public FoodBuilder setVitB5(int vitB5) {
        this.vitB5 = vitB5;
        return this;
    }

    public FoodBuilder setVitD(int vitD) {
        this.vitD = vitD;
        return this;
    }
}
