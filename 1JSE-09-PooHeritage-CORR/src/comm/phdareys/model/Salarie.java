package comm.phdareys.model;

public class Salarie extends Personne {
	// extends exprime l'héritage 
	private String societe;   // Accesseur en modification ou mutator 

	// Constructeur  
	public Salarie (String company, String name, int age) {
		super(name, age);
		setSociete(company);
		System.out.println ("-> Constr. Salarie: " + this.getNom());
	}

	@Override
	public void afficher() {   
		super.afficher();
		System.out.println ("... Et je travaille chez: " + societe);    
	}

	public void setSociete(String societe) {   
		this.societe = societe.toUpperCase();   
	} 

}