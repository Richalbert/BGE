package fr.richard.map.beansmodel;

import java.util.Map;

public class Annuaire {
	
	private String name;		// nom de l annuaire
	
	private Map<String,String> annuaire;
	

	public Annuaire() {}
	
	public Annuaire(String name, Map<String, String> annuaire) {
		super();
		this.name = name;
		this.annuaire = annuaire;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Map<String, String> getAnnuaire() {
		return annuaire;
	}

	public void setAnnuaire(Map<String, String> annuaire) {
		this.annuaire = annuaire;
	}

	@Override
	public String toString() {
		return "Annuaire [name=" + name + ", annuaire=" + annuaire + "]";
	}


	
}
