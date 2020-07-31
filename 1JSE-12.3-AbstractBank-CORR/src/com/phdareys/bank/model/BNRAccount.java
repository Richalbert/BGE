package com.phdareys.bank.model;

public class BNRAccount extends BankAccount {
	private static final float RATE = 0.25F;
	private static final int THRESHOLD = -300;
	
	public BNRAccount(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int getTax() {
		// TODO Auto-generated method stub
		if (this.getBalance() > THRESHOLD)
			return 0;
		return (int) (RATE * (this.getBalance() - THRESHOLD));
	}

}
