import java.util.Scanner;

public class IOKeySet {

	public static void main(String[] args) {
	
		// Déclaration et initialisation des variables
		String firstName = null;
		String lastName= null;
		String introducing = null;
		int age = 0;
		
		// Création d'un objet Scanner
		Scanner sc = new Scanner(System.in);
		
		// Affichage dans la console du texte passé en argument, "en dur" - Sortie standard
		System.out.println("Entrez votre prénom:");	
		// Récupération/ stockage de la saisie dans une variable déjà déclarée
		firstName= sc.nextLine();
		
		System.out.println("Entrez votre nom:");
		lastName = sc.nextLine();
		
		System.out.println("Entrez votre age:");
		age = sc.nextInt();
		
		// Fermeture de l'objet Scanner sc
		sc.close();

		// Stockage dans une variable d'une concaténation de chaînes de caractères "en dur" et de variables
		introducing="Hello " + firstName + " " + lastName + ", vous avez "+ age +" ans.";

		// Affichage dans la console de la variable passée en argument.
		System.out.println(introducing);
		
	}
}
