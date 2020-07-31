package com.phdareys.towns.model;

public class BigTown {
//todo
	private String name;
	private int pop;
	public BigTown(String name, int pop) {
		super();
		this.name = name;
		this.pop = pop;
	}
	public String getName() {
		return name;
	}
	public int getPop() {
		return pop;
	}
	@Override
	public String toString() {
		return "BigTown [name=" + name + ", pop=" + pop + "]";
	}
	
}
