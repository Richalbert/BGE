package model;

public abstract class Telephone {

	private String name;
	private int price;
	
	
	public Telephone(String name) {
		super();
		this.name = name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}
	
	public void sell(int price) {
		this.price = price - this.discount();
	}

	abstract public int discount();
	
}
