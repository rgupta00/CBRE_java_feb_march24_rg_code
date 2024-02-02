package com.session3.b.ex_handling;
class Account{
    private int id;
    private String name;
    private double balance;

    public Account(int id, String name, double balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public void withdraw(double amount){
        balance=balance-amount;
    }


    public void deposit(double amount){
        balance=balance+amount;
    }


}
public class D_UserDefineEx2 {
    public static void main(String[] args) {

    }
}
