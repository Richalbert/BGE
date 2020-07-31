package model;

public class Employe implements Comparable<Employe> {

	private String nom;
	private String prenom;
	private double salaire;

	public Employe(String nom, String prenom, double salaire) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.salaire = salaire;
	}
/**
 * public int compareTo(Object obj): 
 * 		It is used to compare the current object with the specified object. It returns
 *
 *		  positive integer, if the current object is greater than the specified object.
 *		  negative integer, if the current object is less than the specified object.
 *		  zero, if the current object is equal to the specified object.
 *
 */
	@Override
	public int compareTo(Employe employe) {
		if (this.salaire == employe.salaire) {
			return -this.nom.compareTo(employe.nom);
		}
		return this.salaire > employe.salaire ? 1 : -1;
	}

	@Override
	public String toString() {
		return "Employe [nom=" + nom + ", prenom=" + prenom + ", salaire=" + salaire + "]";
	}

	
	
}
