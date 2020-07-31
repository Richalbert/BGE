package com.phdareys.bakery.model;

import java.util.ArrayList;

public class Firm {
	private String name;
	private ArrayList<Employee> emps;
	private int balance;
	private int cost;
	private int income;
	
	public Firm(String name) {
		super();
		this.name = name;
		this.emps = new ArrayList<Employee>();
	}	
	public void hire(Employee emp) {
		this.emps.add(emp);
	}
	public void hire(Employee[] emps) {
		for (Employee e: emps)
			this.hire(e);
	}
	
	public void afficherBilan() {
		// todo 
	}
	public void run() {
		float cost = 0L;
		float income = 0L;
		for (Employee e:this.emps) {	// loop on employees
			ArrayList<ProductSet> prods = e.getProductSets();
			for (ProductSet p:prods) {
				if (e.getClass().toString().contains("Baker")) 
					cost += p.getSetPrice()[0];
				else 
					income += p.getSetPrice()[1];
			}
		}
		this.income = (int) income;
		this.cost = (int) cost;
		this.balance = this.income - this.cost;
	}
	public String getName() {
		return name;
	}
	public int getBalance() {
		return balance;
	}
	public int getCost() {
		return cost;
	}
	public int getIncome() {
		return income;
	}
	@Override
	public String toString() {
		return "Firm [name=" + name + ", emps=" + emps + ", balance=" + balance + ", cost=" + cost + ", income="
				+ income + "]";
	}

}
