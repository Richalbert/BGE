package fr.richard.heritage.model;

public class Salarie extends Personne {

	private String societe;

	public Salarie(String nom, int age, String societe) {
		super(nom, age);
		this.societe = societe;
		System.out.println("creation d un salarie " + nom + " - " + societe);
	}

	

	@Override
	public String toString() {
		return "Salarie [societe=" + societe + "]";
	}

	public void afficher() {
		super.afficher();
		System.out.println("-- classe Salarie " + getSociete());
	}



	public String getSociete() {
		return societe;
	}
	
	
}
