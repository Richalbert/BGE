package model;

public class BNQ extends Compte {
	private static final double TAUX_AGIOS=0.2;
	private static final double DECOUVERT_AUTORISE=0;

	public BNQ(String nom) {
		super(nom);
	}

	@Override
	public double retirer(double retrait) {

		this.solde -= retrait;

		if (this.solde < DECOUVERT_AUTORISE) {
			calculerAgios();
		}

		return this.getSolde();
	}

	//  BNQ : 20% sur le découvert
	@Override
	public void calculerAgios() {
		this.solde += TAUX_AGIOS * this.solde;
	}

}


