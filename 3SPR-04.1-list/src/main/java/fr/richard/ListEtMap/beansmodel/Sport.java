package fr.richard.ListEtMap.beansmodel;

import java.util.List;

public class Sport {
	private String discipline;		// nom de la discipline sportive
	private List<String> joueurs;	// liste de joueurs dans la discipline
	
	
	public Sport() {}				// constructeur anonyme

	public Sport(String discipline, List<String> joueurs) {		// ctor principal
		super();
		this.discipline = discipline;
		this.joueurs = joueurs;
	}


	public String getDiscipline() {
		return discipline;
	}


	public void setDiscipline(String discipline) {
		this.discipline = discipline;
	}


	public List<String> getJoueurs() {
		return joueurs;
	}


	public void setJoueurs(List<String> joueurs) {
		this.joueurs = joueurs;
	}


	@Override
	public String toString() {
		return "Sport [discipline=" + discipline + ", joueurs=" + joueurs + "]";
	}
	
	
	

	
}
