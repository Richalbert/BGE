package com.phdareys.bakery.model;

public class ProductSet {
	private Product prod;
	private int quant;
	
	public ProductSet(Product prod, int quant) {
		super();
		this.prod = prod;
		this.quant = quant;
	}
	public float[] getSetPrice() {
		float [] cs = {
				this.prod.getCostPrice()*this.quant, 
				this.prod.getSellPrice()*this.quant};
		return cs; 
	}   
	@Override
	public String toString() {
		return "ProductSet [prod=" + prod + ", quant=" + quant + "]";
	}

}
