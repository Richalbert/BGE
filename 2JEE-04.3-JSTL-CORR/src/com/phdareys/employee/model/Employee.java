package com.phdareys.employee.model;

public class Employee {

	private String nom;
	private String prenom;
	private int age;
	
	public Employee(String nom, String prenom, int age) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
	}

	public String getNom() {
		return nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public int getAge() {
		return age;
	}

	@Override
	public String toString() {
		return "Employe [nom=" + nom + ", prenom=" + prenom + ", age=" + age + "]";
	}
}
