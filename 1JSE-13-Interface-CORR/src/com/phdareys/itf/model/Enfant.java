package com.phdareys.itf.model;

import java.util.Comparator;

public class Enfant implements Comparator<Integer> {
	int age = 0;
	String name;
	public Enfant(int age, String name) {
		// TODO Auto-generated constructor stub
	}
	@Override
	public int compare(Integer o1, Integer o2) {
		// TODO Auto-generated method stub
		return o1.compareTo(o2);
	}

	

}
