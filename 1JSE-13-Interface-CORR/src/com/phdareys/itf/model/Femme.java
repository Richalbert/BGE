package com.phdareys.itf.model;

public class Femme implements PersonneFutile, PersonneActive {
	private String nom;

	public Femme(String nom) {
		super();
		this.nom = nom;
	}

	// à implémenter obligatoirement
	@Override
	public void seDivertir(String activite) {
		// TODO Auto-generated method stub
		System.out.println (this.nom + " (F) aime: " + 
				activite);
	}

	// à implémenter obligatoirement
	@Override
	public void faireDuSport(String sport) {
		// TODO Auto-generated method stub
		System.out.println (this.nom + 
				" (F) pratique comme sport: " + sport);
		
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	@Override
	public void travaillerBeaucoup(String act) {
		System.out.println (this.nom + 
				" (F) a comme travail: " + act);
		
	}

}
