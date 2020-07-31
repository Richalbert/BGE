package com.phdareys.itf.model;

public class Homme implements 
	PersonneFutile,
	PersonneActive {
	
		// ici 2 interfaces sont implémentés
	private String nom;

	public Homme(String nom) {
		super();
		this.nom = nom;
	}

	// à implémenter obligatoirement (auto-généré)
	@Override
	public void seDivertir(String activite) {
		// TODO Auto-generated method stub
		System.out.println (this.nom + " (H) aime: " + 
				activite);
	}
	
	// à implémenter obligatoirement
	@Override
	public void faireDuSport(String sport) {
		System.out.println (this.nom + 
				" (H) pratique comme sport: " + sport);
		
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
				" bosse beaucoup: " + act);
	}

}
