package com.phdareys.itf.model;

public class Homme implements 
	PersonneFutile,
	PersonneActive {
	
		// ici 2 interfaces sont impl�ment�s
	private String nom;

	public Homme(String nom) {
		super();
		this.nom = nom;
	}

	// � impl�menter obligatoirement (auto-g�n�r�)
	@Override
	public void seDivertir(String activite) {
		// TODO Auto-generated method stub
		System.out.println (this.nom + " (H) aime: " + 
				activite);
	}
	
	// � impl�menter obligatoirement
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
