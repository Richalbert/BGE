package com.phdareys.bank.app;

import com.phdareys.bank.model.BankAccount;
import com.phdareys.bank.model.BNQAccount;
import com.phdareys.bank.model.BNRAccount;
import com.phdareys.bank.model.BNSAccount;


public class BankApp {
	private static final int DEPOSIT = 2000;
	private static final int WITHDRAW = 3000;
	
	public static void main(String[] args) {
		// init
		BankAccount accounts [] = {
				new BNQAccount("Paul"),
				new BNRAccount("Alice"),
				new BNSAccount("Jean"),				
		};
		// task
		for (BankAccount acc: accounts) {
			acc.add(DEPOSIT);
			acc.withdraw(WITHDRAW);
		}
		// view
		for (BankAccount acc: accounts)
			System.out.println (acc);
	}

}
