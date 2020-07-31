package video10;


/**
 * <p>Il s agit d une classe permettant de representer un individu
 * Les individus possedent differents attributs comme un nom et un age</p>
 * 
 * Un exemple de creation d un individu<br/>
 * <code>
 * Personne p = new Personne("Smith", 44);
 * </code>
 * @author richard
 *
 */
public class Personne {
	private String nom;
	private int age;

	/**
	 * Le constructeur
	 * @param nom
	 * @param age
	 */
	public Personne(String nom, int age) {
		this.nom = nom;
		this.age = age;
	}
	
	/**
	 * Renvoie le nom de la personne
	 * 
	 * @return le nom de la personne
	 */
	public String getNom() {
		return this.nom;
	}
	/**
	 * 
	 * @return
	 */
	public int getAge() {
		return this.age;
	}
	
	@Override
	public String toString() {
		return "nom : " + getNom() + " - " + "age : " + getAge();
	}
}
