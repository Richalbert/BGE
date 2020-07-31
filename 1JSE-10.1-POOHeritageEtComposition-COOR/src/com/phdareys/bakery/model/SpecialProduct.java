package com.phdareys.bakery.model;

public class SpecialProduct extends Product {
	private int weight;
		// program can be extended to other product with "extends" key
		// it means you can sell/make other kind of product!! 
	public SpecialProduct(String name, float costPrice, float sellPrice, int weight) {
		super(name, costPrice, sellPrice);
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "SpecialProduct [weight=" + weight + "]";
	}

}
