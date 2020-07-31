package com.phdareys.bean;

public class Meal {
	private int id;
	private String name;
	
	public Meal(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Meal [id=" + id + ", name=" + name + "]";
	}
}
