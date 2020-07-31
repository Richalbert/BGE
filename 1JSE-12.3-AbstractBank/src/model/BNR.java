package model;

public class BNR extends Compte {
	private static final double TAUX_AGIOS=0.25;
	private static final double DECOUVERT_AUTORISE=300;

	public BNR(String nom) {
		super(nom);
	}

	@Override
	public double retirer(double retrait) {

		this.solde -= retrait;

		if (this.solde < -DECOUVERT_AUTORISE) {
			calculerAgios();
		}

		return this.getSolde();
	}

	// BNR : 25% sur le découvert mais la BNR tolère 300 de découvert
	@Override
	public void calculerAgios() {

		double decouvert = DECOUVERT_AUTORISE + this.solde;
		this.solde += TAUX_AGIOS * decouvert;
	}

}
