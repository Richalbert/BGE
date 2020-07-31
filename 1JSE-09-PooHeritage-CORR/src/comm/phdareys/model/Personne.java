package comm.phdareys.model;

import comm.phdareys.tools.Tools;

public class Personne {

	private String nom;    // Nom de la personne 
	private int age;    // Son �ge  

	//-------------------------------------------- 
	// Constructeur � deux param�tres 
	//-------------------------------------------- 
	public Personne(String nom, int age) {    
		this.nom = nom.toUpperCase();    
		if (age != 0 ) setAge (age); 
		System.out.println ("-> Constr. Personne: "+
				this.nom);
	}  
	
	//-------------------------------------------- 
	// Constructeur par d�faut r�tabli 
	//-------------------------------------------- 
	public Personne () {    
		/* On convient qu�une personne 
		 *  dont on ne sait rien aura sa v.i.  
		 *  nom valoris� avec "Nom inconnu" 
		 *  et sa v.i. age valoris�e                
		 * avec la valeur enti�re 0.
		 */
		nom = " Nom inconnu " ; 
		age = 0 ;  
		System.out.println ("-> dbg: constr. 2 Personne");
	}   
	
	public void afficher() {  
		Tools t=new Tools();
		String d=t.getCurrentDate();
//		System.out.println ("--------> Date: " + d + "->Je suis: " + nom + 
	//			" et j'ai: "+age + " ans");    
		System.out.println ("->>>> Je suis: " + nom + " et j'ai: "+age + " ans");    
	}
	// Accesseur en eccriture  
	protected void setAge(int age) {     
		// Ici on fait appel a  une m�thode filtre qui 
		// rejette toute valeur
		//incorrecte de l�age   // ���    
		this.age = age; // Ici l�age convient  
	} 

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	protected int getAge () {
		return this.age;
	}

}
