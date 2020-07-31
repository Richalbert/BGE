package com.phdareys.emp.model;

public class Employee {
	private static final int MONTH_NB = 12;
	private static final float TAX_PERCENT = 0.9f;
	
	String firstName="";
	String lastName="";
	String firm="";
	int age=0;
	int mSal=0;
	int yCost;	// out att: year cost
	
	public Employee(String firstName, String lastName, String firm, int age, int mSal) {
		super();
		this.firstName = firstName;
		this.lastName = lastName.toUpperCase();
		this.firm = firm;
		this.age = age;
		this.mSal = mSal;
		
		this.yCost = 0;	// todo!!
	}

	public void run() {
		this.setyCost((int) (MONTH_NB *  (1 + TAX_PERCENT) * mSal));		
	}
	
	private void setyCost(int yCost) {
		this.yCost = yCost;
	}

	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", firm=" + firm + ", age=" + age
				+ ", mSal=" + mSal + ", yCost=" + yCost + "]";
	}

}
