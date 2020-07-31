package comm.phdareys.model;

public class Manager extends Salarie {
	private int nbSal;
	public Manager(String company, String name, int age, int nbSal) {
		super(company, name, age);
		// TODO Auto-generated constructor stub
		this.nbSal = nbSal;
		System.out.println ("-> Constr. Manager: "+ name);

	}
	@Override
	public void afficher() {
		// TODO Auto-generated method stub
		super.afficher();
		System.out.println ("... Et je gère plusieurs salariés: " + this.nbSal);    
	}

}
