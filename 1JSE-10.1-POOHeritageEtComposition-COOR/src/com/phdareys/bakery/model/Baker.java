package com.phdareys.bakery.model;

public class Baker extends Employee {

	public Baker(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	public float[] make (Product p, int quant) {
		return this.add(p, quant, true);
	}
}
