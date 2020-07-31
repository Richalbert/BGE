/**
 * La classe HelloWord est notre toute 1ère classe!
 * @author Philippe Dareys
 * @version renseigne le numéro de version d'une classe  
 * @since indique depuis quelle version de la classe existe une méthode, un paramètre.
 * @see renvoie à  une autre classe/ méthode via un lien hypertexte.
 * 
 */
public class HelloWorld {
	/**
	 * 
	 * @param args : arguments de la méthode main, étudiés dans un prochain td.
	 * @return void, donc ne retourne rien
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ceci est mon premier commentaire sur une ligne

		/* ceci est mon
		premier
		commentaire 
		sur plusieurs lignes */

		// classe System + objet out + méthode print + le texte à afficher dans la console est l'argument de cette méthode 
		String myString = "My name is Bond, James Bond!!";
		System.out.println(myString);
	}

	
}
