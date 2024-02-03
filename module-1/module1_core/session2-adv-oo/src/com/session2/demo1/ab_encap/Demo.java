package com.session2.demo1.ab_encap;
//encap
//ravi
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
        //BL
        balance-=amount;
    }
    public void deposit(double amount){
        balance+=amount;
    }
    public void print(){
        System.out.println("id :"+ id +" name: "+ name +" bal: " +balance);
    }
}
//rajiv
public class Demo {
    public static void main(String[] args) {

        Account account=new Account(1,"raj",7000);
        account.deposit(2000);

        account.print();
    }
}
