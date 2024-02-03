package com.session4;

import java.util.StringJoiner;
//how to create user define ex

class OverFundExException extends RuntimeException{
    public OverFundExException(String message) {
        super(message);
    }
}

class NotSufficientFundExException extends RuntimeException{
    public NotSufficientFundExException(String message) {
        super(message);
    }
}

class AccountCreationException extends RuntimeException{
    public AccountCreationException(String message) {
        super(message);
    }
}
//MVC
class Account{
    private int id;
    private String name;
    private double balance;

    public Account(int id, String name, double balance) throws ArithmeticException{
        this.id = id;
        this.name = name;
        if(balance<10_000)
            throw new AccountCreationException("balance must be more then or eq to 10K");
        this.balance = balance;
    }
//15L
    public void deposit(int amount){
        balance+=amount;
    }
    //10K
    public void withdraw(int amount){
        balance-=amount;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Account.class.getSimpleName() + "[", "]")
                .add("id=" + id)
                .add("name='" + name + "'")
                .add("balance=" + balance)
                .toString();
    }
}
public class C_UserDefineEx {
    public static void main(String[] args) {
        //throw(throwing an ex delebratily) vs throws user define ex
        Account account= null;
        try {
            account = new Account(1,"raj",90000);
            System.out.println(account);
        } catch (AccountCreationException e) {
            System.out.println(e.getMessage());
        }

    }
}




