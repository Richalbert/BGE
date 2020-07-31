package model;

public abstract class Vehicule {
	
	protected String marque;
	protected String nom;
	protected String identifiant;
	
	
	public Vehicule(String marque, String nom, String identifiant) {
		this.marque = marque;
		this.nom = nom;
		this.identifiant = identifiant;
	}
	
	
	public abstract void reviser();
	

}
