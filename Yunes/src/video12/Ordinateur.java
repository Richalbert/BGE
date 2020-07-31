package video12;

public class Ordinateur {

	private int memoire;
	private int frequence;
	private int disque;
	private String marque;
	

	public Ordinateur(int memoire, int disque) {
		super();		
		this.memoire = memoire;
		this.disque = disque;
		this.frequence = 20;	// GHz
		this.marque = "SuperComputer";
	}

	public String getMarque() {	
		return marque;
	}
	
	public int getDisque() { 
		return this.disque;
	}
	public void setDisque(int disque) { 
		this.disque += disque;
	}

	public int getMemoire() {
		return memoire;
	}
	public void setMemoire(int memoire) {
		this.memoire = memoire;
	}

	public int getFrequence() {
		return frequence;
	}
	public void setFrequence(int frequence) {
		this.frequence = frequence;
	}
	
	
}
