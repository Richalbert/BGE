package com.phdareys.bakery.model;

public class Product {
	private String name;
	private float costPrice;
	private float sellPrice;
	private int quant;		// bonus: to manage Stock!
	
	public Product(String name, float costPrice, float sellPrice) {
		super();
		this.name = name;
		this.costPrice = costPrice;
		this.sellPrice = sellPrice;
		this.quant = 0;
	}
  
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getCostPrice() {
		return costPrice;
	}


	public void setCostPrice(float costPrice) {
		this.costPrice = costPrice;
	}


	public float getSellPrice() {
		return sellPrice;
	}


	public void setSellPrice(float sellPrice) {
		this.sellPrice = sellPrice;
	}


	public int getQuant() {
		return quant;
	}


	public void setQuant(int quant) {
		this.quant = quant;
	}


	@Override
	public String toString() {
		return "Product [name=" + name + ", costPrice=" + costPrice + ", sellPrice=" + sellPrice + ", quant=" + quant
				+ "]";
	}


}
