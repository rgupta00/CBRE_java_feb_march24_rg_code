package c;

abstract public class Account {
	private String name;
	private String accountNumber;
	private double accountBalance;
	
	public String getName() {
		return name;
	}
	public String getAccountNumber() {
		return accountNumber;
	}

	public double getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}

	public Account(String name, String accountNumber, double accountBalance) {
		this.name = name;
		this.accountNumber = accountNumber;
		this.accountBalance = accountBalance;
	}
	
	public void deposit(double amount) {
		accountBalance+=amount;
	}

	public abstract void withdraw(double amount);
	@Override
	public String toString() {
		return "Account [name=" + name + ","
				+ " accountNumber=" + accountNumber + ", accountBalance=" + accountBalance
				+ "]";
	}
	
	
}
