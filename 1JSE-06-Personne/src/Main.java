
public class Main {

	public static void main(String[] args) {
		
		Personne p1,p2,p3;
		
		p1 = new Personne();		
		p2 = new Personne("Martin");	// OK
		p3 = new Personne("John", "Orange");		
		Personne [] tableauPersonne = {p1,p2,p3, new Personne("Alicia","SFR")};
		
		for (Personne personne : tableauPersonne) {
			personne.quitterSociete();
			personne.afficher();
		}
		
		System.out.println("");
		
		for (int i = 0; i < tableauPersonne.length; i++) {
			tableauPersonne[i].integrerSociete("Richard SA");
			tableauPersonne[i].afficher();	
		}
		
		System.out.println("");
		
//		p1.afficher();
//		p2.afficher();
//		p3.afficher();
		
		//System.out.println("Je m'appelle" + p2.nom );	refuse a la compilation
		
		p2.integrerSociete("Java SARL");
		p2.afficher();
		
		// p3 est coopte par p2
		p3.integrerSociete(p2.getSociete());
		p3.afficher();
		
		p2.quitterSociete();
		p2.afficher();
	}

}
