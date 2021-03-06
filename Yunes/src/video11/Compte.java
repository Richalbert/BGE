package video11;

public class Compte {

	private int depot;
	
	public Compte() {
		this.depot = 50;	// cadeau de bienvenue
	}
	
	public int getDepot() {
		return this.depot;
	}
	
	public void deposer(int somme) {
		this.depot += somme;
	}
	
	public int retirer(int somme) {
		if ( this.depot - somme < 0) { return 0;}
		this.depot -= somme;
		return somme;
	}
}
