package comm.phdareys.app;

import comm.phdareys.model.Manager;
import comm.phdareys.model.Personne;
import comm.phdareys.model.PersonneMariee;
import comm.phdareys.model.Salarie;

public class PooHeritage {
	/* héritage, polymorphisme, intégrité données */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Salarie s=new Personne(); !! non
		//Personne pe = new Salarie("free", "duval", 39);
		//pe.afficher();

		Personne [] tabP = new Personne [] {
				new Personne ("Durant", 30),
				new Salarie ("Orange", "Dupont", 34),
				new Personne ("Duparc", 50),
				new PersonneMariee("Paul", 22, 
						new Personne("Virginie", 21)),
				new Manager("Nissan", "Ghosn", 50,  10000),
		};
		
		for (Personne p:tabP)
			p.afficher();
	}
}
