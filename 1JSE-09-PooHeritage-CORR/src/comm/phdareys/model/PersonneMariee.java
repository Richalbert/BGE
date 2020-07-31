package comm.phdareys.model;

public class PersonneMariee extends Personne {
	private Personne conjoint;
	public PersonneMariee(String nom, int age, Personne conjoint) {
		super(nom, age);
		// TODO Auto-generated constructor stub
		this.conjoint = conjoint;
	}

	@Override
	public void afficher() {
		// TODO Auto-generated method stub
		super.afficher();
		System.out.println ("... Et je suis marié avec: ");    
		this.conjoint.afficher();
	}


}
