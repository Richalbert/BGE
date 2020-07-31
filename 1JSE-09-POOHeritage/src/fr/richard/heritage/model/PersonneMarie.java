package fr.richard.heritage.model;

public class PersonneMarie extends Personne {
	
	private Personne conjoint;

	public PersonneMarie(String nom, int age, Personne conjoint) {
		super(nom, age);
		this.conjoint = conjoint;
	}

	@Override
	public void afficher() {
		super.afficher();
		System.out.println(" Je suis mariee avec " + this.conjoint.getNom());
	}
	
	
	

}
