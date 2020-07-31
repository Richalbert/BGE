import java.util.Scanner;

public class IntSum {
	// Le main est chargé de l'orchestration. Il ne fait qu'appeler les méthodes
	public static void main(String[] args) {
		
		// Objet local (pour éviter de tout déclarer en 'static')
		IntSum iS = new IntSum();
		// Déclaration de la variable myInt de type int, et initialisation via la fonction readInteger() 
		int myInt = iS.readInteger();
		// Appel de la méthode displayResult(), prenant en paramètre une chaine de caractère "en dur" ainsi que la méthode sum(...)
		iS.displayResult ("Somme des entiers jusqu'à: " + myInt + " = " + 
				iS.sumNIntegers (myInt));
		// Appel de la méthode displayResult(), prenant en paramètre une chaine de caractère "en dur" ainsi que la méthode sumMultipleOfThree (...))
		iS.displayResult ("Somme des multiples de trois de l'entier: " + myInt + " = " + 
				iS.sumNIntegers (3, myInt));
		// Appel de la méthode displayResult(), prenant en paramètre une chaine de caractère "en dur" ainsi que la méthode sumMultipleOfThree (...))
//		iS.displayResult ("Fact entier: " + myInt + " = " + 
//				iS.fact (myInt));
	}

	
	// Hors du main, développement des 4 méthodes invoquées par le main
	
	/* Méthode retournant un entier, sans paramètre
	 * et permettant de récupérer la valeur entrée par l'utilisateur 
	 */
	public int readInteger () {
		// Demander à l'utilisateur de saisir un entier
		System.out.print("Entrer Entier: ");
		
		// Création d'un objet de la classe utilitaire Scanner, à importer
		Scanner sc = new Scanner (System.in);
		
		// Déclaration d'une variable de type int, stockant la valeur saisie par l'utilisateur via le scanner
		int myInt = sc.nextInt();
		
		// Fermeture de l'objet scanner
		sc.close();
		
		// La variable myInt est retournée
		return myInt;
	}


	// Méthode d'affichage du résultat
	// Cette méthode ne retourne rien, prend en paramètre une chaine de caractère "en dur" 
	public void displayResult(String sRes) {
		// Affichage dans la console de la chaîne de caractères passée en paramètre
		System.out.println (sRes);
	}

	
	// Méthode de calcul de la somme des entiers inférieurs ou égal à l'entier entré en paramètre
	// Cette méthode retourne un entier, prend un entier en paramètre 
	public int sumNIntegers (int dep) {
		// Stucture conditionnelle, si la valeur argument vaut 1...
		if (dep == 1)
			// on retourne 1
			return 1;
		// récursivité: la fonction s'appelle elle-même.
		return dep + sumNIntegers (-- dep);
	}
	

	// Méthode de calcul de la somme des entiers multiples de 3, inférieurs ou égal à l'entier entré en paramètre
	// Méthode retournant en entier, prenant un entier en paramètre
	// (même nom que la précédente avec une signature différente: polymorphisme)
	public int sumNIntegers (int multipleValue, int dep) {
		// Déclaration de la variable à retourner, de type int, initialisée à 0
		int sum = 0;
		/* Boucle for: 
		 *  déclaration et initialisation de l'itérateur à 0; 
		 *  condition de l'itérateur;
		 *  incrémentation de l'itérateur
		 */
		for (int i=0; i<= dep; i++) {
			/* Instruction sous forme de structure conditionnelle
			 * s'il s'agit bien d'un multiple de 3...
			 */
			if (i % multipleValue == 0)
				/* (Instruction du if sous forme d'incrémentation)
				 * ... la variable sum est incrémentée d'autant, 
				 * à chaque tour de boucle où i est lui-même incrémenté 
				 * et jusqu'à ce que la condition soit fausse
				 */
				sum += i;
		}
		// la variable incrémentée est retournée
		return sum;
	}

	public int fact (int n) {
		if (n == 1)
			return 1;
		return (fact (n-1) * n);
	}
}
