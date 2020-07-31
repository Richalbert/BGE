package model;

public abstract class Compte {

	private String nom;		// nom du titulaire du compte
	protected double solde;


	protected Compte(String nom) {
		this(nom,0);
//		this.nom = nom;
//		this.solde = 0;
	}
		
	protected Compte(String nom, double solde) {
		super();
		this.nom = nom;
		this.solde = solde;
	}

	protected double getSolde() {
		return solde;
	}

	protected void setSolde(double solde) {
		this.solde = solde;
	}

	// depend de la banque a cause des agios
	public abstract double retirer(double retrait) ;
	public abstract void calculerAgios();

	public void ajouter(double credit) {
		this.solde += credit;
	}
	
	@Override
	public String toString() {
		return "Compte [nom=" + nom + ", solde=" + solde + "]";
	}

	

}
