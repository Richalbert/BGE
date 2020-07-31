package fr.richard.ioc.model;

/**
 * 
 * 2 - la factory fait le new 
 * le role de cette classe est de trouver le joueur de tennis
 * 
 *
 */
public class TennisFactory {
	
	private String nom;		// nom de l usine

	public TennisFactory(String nom) {
		super();
		this.nom = nom;
		System.out.println("creation TennisFactory");
	}
	
	/**
	 * methode appele par le programme principale
	 */
	public TennisCapable get() {
		System.out.println("je cherche un jouer ...");
		//return new ChampionFrancais();
		return new Register();
		
	}
}
