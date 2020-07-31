package model;

public abstract class Animal {

	protected String name;

	protected Animal(String name) {
		this.name = name;
	}
	
	public void drink() {
		System.out.println(this.name + " boit de l'eau");
	}
	
	abstract public void eat();

	public String getName() {
		return name;
	}
	
	
}
