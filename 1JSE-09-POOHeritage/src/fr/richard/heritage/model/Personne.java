package fr.richard.heritage.model;

public class Personne {
	
	private String nom;
	private int age;
	
	
	public Personne(String nom, int age) {
		this.nom = nom;
		this.age = age;
		System.out.println("creation d'une personne " + nom);
	}


	@Override
	public String toString() {
		return "Personne [nom=" + nom + ", age=" + age + "]";
	}
	
	public void afficher() {
		System.out.println("classe Personne " + getNom() );
	}


	public String getNom() {
		return nom;
	}

}
