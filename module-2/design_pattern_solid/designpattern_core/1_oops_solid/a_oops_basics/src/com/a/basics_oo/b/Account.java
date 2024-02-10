package com.a.basics_oo.b;

//encapsulation = data hiding + business contstrants 
public class Account {
	private  int id;
	private  String name;
	private double balance;

	public Account(int id, String name, double balance) {
		this.id = id;
		this.name = name;
		this.balance = balance;
	}

	public void deposit(double amount) {
		balance=balance+amount;
	}
	
	public double intrestCal() {
		return balance*02;
	}
}
