package com.phdareys.bank.model;

public abstract class BankAccount {
	protected int balance;
	protected String name;
	
	protected BankAccount(String name) {
		this(name, 0);
	}
	protected BankAccount(String name, int initialDeposit) {
		// TODO Auto-generated constructor stub
		this.balance = initialDeposit;
		this.name = name;
	}
	public void add (int sum) {	
		this.addOrWithdraw(sum);
	}
	public void withdraw (int sum) {	
		this.addOrWithdraw(-sum);
	}
	public int getBalance() {
		return balance;
	}
	@Override
	public String toString() {
		return "BankAccount [name=" + name + ", balance=" + balance + "]";
	}
	public abstract int getTax();
	
	private void addOrWithdraw (int sum) {	// sum maybe < 0
		this.balance += sum;
		if (this.balance < 0)	// must pay taxes!!!
			this.balance += this.getTax();
	}

}
