package fr.richard.vector.model;

import java.util.Vector;

public class Pays2 {


	private String continent = "";
	private String nom = "";
	private int population = 0;
	private Vector<String> ville;
	
	public Pays2(String continent, String nom, int population, String [] villes) {
		this.continent = continent;
		this.nom = nom;
		this.population = population;
		this.ville = new Vector<String>();
		for (String str : villes) {
			this.ville.add(str); 
		}
		
	}
	
	
	public Pays2(String continent, String nom, int population, String capital) {
		this.continent = continent;
		this.nom = nom;
		this.population = population;
		this.ville = new Vector<String>();
		this.ville.add(capital); 
	}
	
	public Pays2(String continent, String nom, int population) {
		this.continent = continent;
		this.nom = nom;
		this.population = population;
		this.ville = new Vector<String>();
	}
	public Pays2(String continent, String nom) {
		this(continent,nom,-1);
		this.continent = continent;
		this.nom = nom;
	}
	public Pays2(String continent) {
		this(continent,"no_nom");
		this.continent = continent;
	}
	public Pays2() {
		this("no_continent");
	}


	public String ajouterVille(String ville) {
		String resultat = ville + " existe deja";

		if ( !this.ville.contains(ville) ) {
			this.ville.add(ville);
			resultat = ville + " ajoute";
		}

		return resultat;
	}

	public String supprimerVille(String ville) {
		String resultat = ville + " n'existe pas";

		if ( this.ville.contains(ville) ) {
			this.ville.remove(ville);
			resultat = ville + " supprime";
		}

		return resultat;
	}


	@Override
	public String toString() {
		return "Pays [continent=" + continent + ", nom=" + nom + ", population=" + population + ", ville=" + ville
				+ "]";
	}
}

