package com.phdareys.bakery.model;

import java.util.ArrayList;

public class Employee {
	protected String name;
	protected ArrayList<ProductSet> productSets;
	
	public Employee(String name) {
		super();
		this.name = name;
		this.productSets = new ArrayList<ProductSet>();
	}

	public float[] add (Product p, int quant, boolean raiseProdQuantity) {
		ProductSet pS = new ProductSet(p, quant);
		this.productSets.add(pS);
			// updates remaining quantity of product
		p.setQuant(p.getQuant() + (raiseProdQuantity ? quant : -quant));
		return pS.getSetPrice();
	}

	public ArrayList<ProductSet> getProductSets() {
		return productSets;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", products=" + productSets + "]";
	}
	
}
