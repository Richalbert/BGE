import java.util.Scanner;

public class IOKeySet {

	public static void main(String[] args) {
	
		// D�claration et initialisation des variables
		String firstName = null;
		String lastName= null;
		String introducing = null;
		int age = 0;
		
		// Cr�ation d'un objet Scanner
		Scanner sc = new Scanner(System.in);
		
		// Affichage dans la console du texte pass� en argument, "en dur" - Sortie standard
		System.out.println("Entrez votre pr�nom:");	
		// R�cup�ration/ stockage de la saisie dans une variable d�j� d�clar�e
		firstName= sc.nextLine();
		
		System.out.println("Entrez votre nom:");
		lastName = sc.nextLine();
		
		System.out.println("Entrez votre age:");
		age = sc.nextInt();
		
		// Fermeture de l'objet Scanner sc
		sc.close();

		// Stockage dans une variable d'une concat�nation de cha�nes de caract�res "en dur" et de variables
		introducing="Hello " + firstName + " " + lastName + ", vous avez "+ age +" ans.";

		// Affichage dans la console de la variable pass�e en argument.
		System.out.println(introducing);
		
	}
}
