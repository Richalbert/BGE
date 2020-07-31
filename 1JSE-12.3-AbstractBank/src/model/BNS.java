package model;

public class BNS extends Compte {
//	private static final double TAUX_AGIOS=0;
//	private static final double DECOUVERT_AUTORISE=0;

	public BNS(String nom) {
		super(nom);
	}

	@Override
	public double retirer(double retrait) {
		this.solde -= retrait;
		
		return this.getSolde();
	}

	// BNS pas d'agio
	@Override
	public void calculerAgios() {
	}

}
