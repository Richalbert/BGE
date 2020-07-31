package com.phdareys.bank.model;

public class BNQAccount extends BankAccount {
	private static final float RATE = 0.2F;
	public BNQAccount(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int getTax() {
		// TODO Auto-generated method stub
		return (int) (RATE * this.getBalance());
	}

}
