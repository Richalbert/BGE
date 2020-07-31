package fr.richard.heritage.model;

public class PersonneTresInterresse extends Personne {

	private Pdg conjoint;

	public PersonneTresInterresse(String nom, int age, Pdg conjoint) {
		super(nom, age);
		this.conjoint = conjoint;
	}

	@Override
	public void afficher() {
		// TODO Auto-generated method stub
		super.afficher();
		System.out.println(" Je suis mariee avec " + this.conjoint.getNom());
	}
	
	
}
