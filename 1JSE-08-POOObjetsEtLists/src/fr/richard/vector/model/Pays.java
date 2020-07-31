package fr.richard.vector.model;

import java.util.Vector;



/**
 * Un pays a pour attributs: un continent, un nom, une population, des villes
 * @author richard
 *
 */
public class Pays {

	private String continent = "";
	private String nom = "";
	private int population = 0;
	private Vector<String> ville = null;

	
	public Pays(String continent, String nom, int population) {
		this.continent = continent;
		this.nom = nom;
		this.population = population;
		this.ville = new Vector<String>();
	}
	public Pays(String continent, String nom) {
		this(continent,nom,-1);
		this.continent = continent;
		this.nom = nom;
	}
	public Pays(String continent) {
		this(continent,"no_nom");
		this.continent = continent;
	}
	public Pays() {
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
