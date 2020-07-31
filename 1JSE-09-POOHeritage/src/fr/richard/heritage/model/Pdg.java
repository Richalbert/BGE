package fr.richard.heritage.model;

public class Pdg extends Personne {
	private int stockOption;

	public Pdg(String nom, int age, int stockOption) {
		super(nom, age);
		this.stockOption = stockOption;
	}

	@Override
	public void afficher() {
		super.afficher();
		System.out.println("Je suis PDG");
	}
	
	

}
