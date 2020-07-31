import java.util.Scanner;

public class IntSum {
	// Le main est charg� de l'orchestration. Il ne fait qu'appeler les m�thodes
	public static void main(String[] args) {
		
		// Objet local (pour �viter de tout d�clarer en 'static')
		IntSum iS = new IntSum();
		// D�claration de la variable myInt de type int, et initialisation via la fonction readInteger() 
		int myInt = iS.readInteger();
		// Appel de la m�thode displayResult(), prenant en param�tre une chaine de caract�re "en dur" ainsi que la m�thode sum(...)
		iS.displayResult ("Somme des entiers jusqu'�: " + myInt + " = " + 
				iS.sumNIntegers (myInt));
		// Appel de la m�thode displayResult(), prenant en param�tre une chaine de caract�re "en dur" ainsi que la m�thode sumMultipleOfThree (...))
		iS.displayResult ("Somme des multiples de trois de l'entier: " + myInt + " = " + 
				iS.sumNIntegers (3, myInt));
		// Appel de la m�thode displayResult(), prenant en param�tre une chaine de caract�re "en dur" ainsi que la m�thode sumMultipleOfThree (...))
//		iS.displayResult ("Fact entier: " + myInt + " = " + 
//				iS.fact (myInt));
	}

	
	// Hors du main, d�veloppement des 4 m�thodes invoqu�es par le main
	
	/* M�thode retournant un entier, sans param�tre
	 * et permettant de r�cup�rer la valeur entr�e par l'utilisateur 
	 */
	public int readInteger () {
		// Demander � l'utilisateur de saisir un entier
		System.out.print("Entrer Entier: ");
		
		// Cr�ation d'un objet de la classe utilitaire Scanner, � importer
		Scanner sc = new Scanner (System.in);
		
		// D�claration d'une variable de type int, stockant la valeur saisie par l'utilisateur via le scanner
		int myInt = sc.nextInt();
		
		// Fermeture de l'objet scanner
		sc.close();
		
		// La variable myInt est retourn�e
		return myInt;
	}


	// M�thode d'affichage du r�sultat
	// Cette m�thode ne retourne rien, prend en param�tre une chaine de caract�re "en dur" 
	public void displayResult(String sRes) {
		// Affichage dans la console de la cha�ne de caract�res pass�e en param�tre
		System.out.println (sRes);
	}

	
	// M�thode de calcul de la somme des entiers inf�rieurs ou �gal � l'entier entr� en param�tre
	// Cette m�thode retourne un entier, prend un entier en param�tre 
	public int sumNIntegers (int dep) {
		// Stucture conditionnelle, si la valeur argument vaut 1...
		if (dep == 1)
			// on retourne 1
			return 1;
		// r�cursivit�: la fonction s'appelle elle-m�me.
		return dep + sumNIntegers (-- dep);
	}
	

	// M�thode de calcul de la somme des entiers multiples de 3, inf�rieurs ou �gal � l'entier entr� en param�tre
	// M�thode retournant en entier, prenant un entier en param�tre
	// (m�me nom que la pr�c�dente avec une signature diff�rente: polymorphisme)
	public int sumNIntegers (int multipleValue, int dep) {
		// D�claration de la variable � retourner, de type int, initialis�e � 0
		int sum = 0;
		/* Boucle for: 
		 *  d�claration et initialisation de l'it�rateur � 0; 
		 *  condition de l'it�rateur;
		 *  incr�mentation de l'it�rateur
		 */
		for (int i=0; i<= dep; i++) {
			/* Instruction sous forme de structure conditionnelle
			 * s'il s'agit bien d'un multiple de 3...
			 */
			if (i % multipleValue == 0)
				/* (Instruction du if sous forme d'incr�mentation)
				 * ... la variable sum est incr�ment�e d'autant, 
				 * � chaque tour de boucle o� i est lui-m�me incr�ment� 
				 * et jusqu'� ce que la condition soit fausse
				 */
				sum += i;
		}
		// la variable incr�ment�e est retourn�e
		return sum;
	}

	public int fact (int n) {
		if (n == 1)
			return 1;
		return (fact (n-1) * n);
	}
}
