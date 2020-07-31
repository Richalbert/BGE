package video06;

/**
 * Commentaire JavaDoc
 * @author richard
 *
 */
public class Personne {
	private String nom;
	private int age;

	
	public Personne(String nom, int age) {
		this.nom = nom;
		this.age = age;
	}
	
	
	public String getNom() {
		return this.nom;
	}
	public int getrAge() {
		return this.age;
	}
	
	@Override
	public String toString() {
		return "nom : " + getNom() + " - " + "age : " + getrAge();
	}
}
