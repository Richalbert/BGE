package com.phdareys.bakery.model;

public class Seller extends Employee {

	public Seller(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	public float[] sell (Product p, int quant) {
		if (p.getQuant()<quant)	// try to sell more than exists...
			System.out.println ("Only: " + p.getQuant() + " of: " + p.getName() + " are available!");
		return this.add(p, quant, false);
	}
}
